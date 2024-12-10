package com.example.classroom.api;

import java.util.List;

import com.example.classroom.Entity.Professeur;
import com.example.classroom.Service.ProfesseurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping("/api/professeurs")
public class ProfesseurController {


    private ProfesseurService professeurService;

    @GetMapping
    public List<Professeur> getAllProfesseurs() {
        return professeurService.getAllProfesseurs();
    }

    @GetMapping("/{id}")
    public Professeur getProfesseurById(@PathVariable Long id) {
        return professeurService.getProfesseurById(id);
    }

    @PostMapping
    public Professeur createProfesseur(@RequestBody Professeur professeur) {
        return professeurService.createProfesseur(professeur);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        professeurService.deleteProfesseur(id);
    }

    @GetMapping("/search")
    public List<Professeur> searchProfesseur(@RequestParam String keyword) {
        return professeurService.searchProfesseurByKeyword(keyword);
    }
}