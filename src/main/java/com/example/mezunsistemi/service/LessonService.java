package com.example.mezunsistemi.service;

import com.example.mezunsistemi.model.Lesson;
import com.example.mezunsistemi.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(){
        return lessonRepository.findAll();
    }
}
