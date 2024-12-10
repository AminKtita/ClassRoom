package com.example.classroom.Service;
import com.example.classroom.Entity.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> getAllCours();
    Cours getCoursById(Long id);
    Cours createCours(Cours cours);
    void deleteCours(Long id);
    List<Cours> searchCoursByKeyword(String keyword);
}
