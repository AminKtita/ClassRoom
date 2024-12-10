package com.example.classroom.Service;

import com.example.classroom.Entity.Professeur;

import java.util.List;

public interface IProfesseurService {
    List<Professeur> getAllProfesseurs();
    Professeur getProfesseurById(Long id);
    Professeur createProfesseur(Professeur professeur);
    void deleteProfesseur(Long id);
    List<Professeur> searchProfesseurByKeyword(String keyword);

}
