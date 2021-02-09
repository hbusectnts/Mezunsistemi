package com.example.mezunsistemi.repository;

import com.example.mezunsistemi.model.Departman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmanRepository extends JpaRepository<Departman, Long> {

}
