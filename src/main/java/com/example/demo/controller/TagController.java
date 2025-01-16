package com.example.demo.controller;

import com.example.demo.data.TagRepository;
import com.example.demo.model.Tag;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("tags")
public class TagController {

    @Autowired
    TagRepository tagRepository;

    @GetMapping
    public String displayTags(Model model) {
        model.addAttribute("title", "All Tags");
        model.addAttribute("tags", tagRepository.findAll());
        return "tags/index";
    }

    @GetMapping("create")
    public String displayCreateTagForm(Model model) {
        model.addAttribute("title", "Create Tag");
        model.addAttribute(new Tag());
        return "tags/create";
    }

    @PostMapping("create")
    public String processCreateTagForm(@ModelAttribute @Valid Tag tag, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Tag");
            model.addAttribute("errorMessage", "Validation failed: Name must be 3-25 characters long.");
            return "tags/create";
        }

        try {
            tagRepository.save(tag);
        } catch (Exception e) {
            model.addAttribute("title", "Create Tag");
            model.addAttribute("errorMessage", "An error occurred while saving the tag.");
            return "tags/create";
        }

        return "redirect:/tags";
    }


}
