package com.example.mezunsistemi.service;

import com.example.mezunsistemi.model.Note;
import com.example.mezunsistemi.model.User;
import com.example.mezunsistemi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> notesByUser(User user){
        return noteRepository.findByUser(user);
    }

    public void save(Note note){
        double sonuc=(note.getVize()*0.4)+(note.getFnal()*0.6);;
        if(sonuc<50){
            sonuc=(note.getVize()*0.4)+(note.getBüt()*0.6);
        }


        note.setOrtalama(sonuc);
        noteRepository.save(note);
    }

}
