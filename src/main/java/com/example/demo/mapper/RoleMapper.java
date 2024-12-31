package com.example.demo.mapper;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // marcheaza o clasa pentru a deveni un bean gestionat de Spring, permitand astfel sa o creeze si sa o injecteze in alte componente
public class RoleMapper {

    public RoleDto roleEntityToDto (Role role){
        return RoleDto.builder()
                .role(role.getRole())
                .build();
    }

    public List<RoleDto> roleListEntityToDto(List<Role> roles){
        return roles.stream() // converteste lista de entitati Role intr-un flux (stream), care permite procesarea elementelor din lista intr-un mod functional
                .map(role -> roleEntityToDto(role)) // pt fiecare obiect role din lista de entitati se apeleaza metoda roleEntityToDto(role)
                .toList(); // se colecteaza rezultatele intr-o lista
    }

    public Role roleDtoToEntity(RoleDto roleDto){
        return Role.builder()
                .role(roleDto.role()) // seteaza valoarea campului role din entitatea cu valoarea role din roleDto
                .build();
    }

    public List<Role> roleListDtoToEntity(List<RoleDto> roleDtos){
        return roleDtos.stream()
                .map(roleDto -> roleDtoToEntity(roleDto))
                .toList();
    }
}
