package com.example.classroom.Service;

import com.example.classroom.Entity.Cours;
import com.example.classroom.Repositry.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CoursService implements ICoursService {


    private CoursRepository coursRepository;

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getCoursById(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }

    @Override
    public List<Cours> searchCoursByKeyword(String keyword) {
        return coursRepository.findByKeyword(keyword);
    }
}
