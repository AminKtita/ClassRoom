package com.example.classroom.Service;

import com.example.classroom.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long id);
    Etudiant createEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> searchEtudiantByKeyword(String keyword);

}
