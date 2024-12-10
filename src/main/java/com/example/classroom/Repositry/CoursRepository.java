package com.example.classroom.Repositry;

import com.example.classroom.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface CoursRepository extends JpaRepository<Cours, Long> {
    @Query("SELECT c FROM Cours c WHERE c.nom LIKE %:keyword% OR c.description LIKE %:keyword%")
    List<Cours> findByKeyword(@Param("keyword") String keyword);

}
