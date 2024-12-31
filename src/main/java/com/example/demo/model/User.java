package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    private String password;

    @Singular // face ca roles sa poata fi setat folosind un singur rol

    // fetch = FetchType.EAGER - rolurile vor fi incarcate imediat dupa ce un obiect User este incarcat in bd
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) // relatie many-to-many intre user si role
    @JoinTable(name = "users_roles",
            joinColumns = {
                    @JoinColumn(name = "USERS_ID",
                            referencedColumnName = "ID")},
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLES_ID",
                            referencedColumnName = "ID")})
    private List<Role> roles;

    // daca nu le setam cu @Builder.Default atunci vor fi folosite valori implicite true
    @Builder.Default
    private Boolean accountNonExpired = true;

    @Builder.Default
    private Boolean accountNonLocked = true;

    @Builder.Default
    private Boolean credentialsNonExpired = true;

    @Builder.Default
    private Boolean enabled = true;

    private String firstName;

    private String lastName;

    @NaturalId(mutable = true) // emailAddress este un identificator unic, care poate fi folosit pentru cautari rapide si este mutable(valoarea poate fi modificata dupa ce a fost setata initial)
    private String emailAddress;

    private LocalDate birthdate;

}
