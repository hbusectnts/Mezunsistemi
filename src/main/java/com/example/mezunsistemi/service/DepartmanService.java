package com.example.mezunsistemi.service;

import com.example.mezunsistemi.model.Departman;
import com.example.mezunsistemi.repository.DepartmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmanService {
    @Autowired
    private DepartmanRepository departmanRepository;

    public List<Departman> listAllDepartman(){
        return departmanRepository.findAll();
    }

}
