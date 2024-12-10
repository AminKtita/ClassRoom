package com.example.classroom.Service;

import com.example.classroom.Entity.Professeur;
import com.example.classroom.Repositry.ProfesseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProfesseurService implements IProfesseurService {

    private ProfesseurRepository professeurRepository;

    @Override
    public List<Professeur> getAllProfesseurs() {
        return professeurRepository.findAll();
    }

    @Override
    public Professeur getProfesseurById(Long id) {
        return professeurRepository.findById(id).orElse(null);
    }

    @Override
    public Professeur createProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    @Override
    public void deleteProfesseur(Long id) {
        professeurRepository.deleteById(id);
    }

    @Override
    public List<Professeur> searchProfesseurByKeyword(String keyword) {
        return professeurRepository.findByKeyword(keyword);
    }
}
