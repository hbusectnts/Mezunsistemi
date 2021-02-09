package com.example.mezunsistemi.model;

import javax.persistence.*;


@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int vize;
    private int fnal;
    private int büt;

    private double ortalama;
    @ManyToOne
    @JoinColumn(name="ders_id")
    private Lesson lesson;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFnal() {
        return fnal;
    }

    public void setFnal(int fnal) {
        this.fnal = fnal;
    }

    public int getBüt() {
        return büt;
    }

    public void setBüt(int büt) {
        this.büt = büt;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public double getOrtalama() {
     return ortalama;

    }

    public void setOrtalama(double ortalama) {
       this.ortalama=ortalama;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
