package com.example.mezunsistemi.repository;

import com.example.mezunsistemi.model.Note;
import com.example.mezunsistemi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {


    List<Note> findByUser(User user);
}
