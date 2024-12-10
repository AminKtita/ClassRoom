package com.example.classroom.api;

import com.example.classroom.Entity.Cours;
import com.example.classroom.Service.CoursService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api/cours")
public class CoursController {


    private CoursService coursService;

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    @GetMapping("/{id}")
    public Cours getCoursById(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }

    @DeleteMapping("/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
    }

    @GetMapping("/search")
    public List<Cours> searchCours(@RequestParam String keyword) {
        return coursService.searchCoursByKeyword(keyword);
    }
}
