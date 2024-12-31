package com.example.demo.repository;

import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role); // aceasta metoda nu este definita in JpaRepository, dar o pot adauga aici ca sa fac interogari personalizate
}
