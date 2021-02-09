package com.example.mezunsistemi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double kredi;
    @OneToMany(mappedBy = "lesson")
    private List<Note> notes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKredi() {
        return kredi;
    }

    public void setKredi(double kredi) {
        this.kredi = kredi;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
