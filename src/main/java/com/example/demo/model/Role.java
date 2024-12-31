package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // combinatie de mai multe adnotari Lombok care genereaza automat: @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor(genereaza constructor pt toate campurile final si non-null)
@NoArgsConstructor // genereaza un constructor fara argumente
@AllArgsConstructor // genereaza un constructor cu toti parametrii
@Builder
@Entity // marcheaza clasa ca fiind o entitate, adica va fi asociata cu o tabela din BD
@Table(name = "ROLES") // acesta va fi numele tabelei asociat cu entitatea
public class Role {


    @Id // marcheaza campul id ca fiind cheie primara
    @GeneratedValue // valoarea va fi generata automat
    private Integer id;

    @NotNull
    @Column(unique = true) // valoarea campului role trebuie sa fie unica in tabelul ROLES
    private String role;
}
