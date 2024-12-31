package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // @EntityGraph = specifica ce relatii de entitate trebuie incarcate intr-o singura interogare, folosind fetch join
    // type = EntityGraph.EntityGraphType.FETCH = indica faptul ca relatiile vor fi incarcate imediat (FetchType.EAGER), nu pe masura ce sunt accesate
    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH,
                  attributePaths = {"roles"})
    Optional<User> findByUsername(String username);

    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {"roles"})
    List<User> findAll();

    // @Query = permite definirea unor interogari JPQL
    @Query("SELECT u FROM User u WHERE u.username = ?#{ principal.username}")
    Optional<User> findLoginUser();


    boolean existsByEmailAddress(String emailAddress);
}
