package com.example.classroom.Repositry;

import com.example.classroom.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    @Query("SELECT e FROM Etudiant e WHERE e.nom LIKE %:keyword% OR e.email LIKE %:keyword%")
    List<Etudiant> findByKeyword(@Param("keyword") String keyword);
}
