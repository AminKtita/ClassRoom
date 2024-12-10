package com.example.classroom.Repositry;

import com.example.classroom.Entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
    @Query("SELECT p FROM Professeur p WHERE p.nom LIKE %:keyword%")
    List<Professeur> findByKeyword(@Param("keyword") String keyword);
}
