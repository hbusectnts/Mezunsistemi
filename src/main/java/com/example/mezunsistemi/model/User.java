package com.example.mezunsistemi.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String tcKimlikNo;
    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String ogrNo;

    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String name;
    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String surname;

    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String email;

    @NotEmpty(message = "Bu alan gereklidir.")
    @NotNull
    private String password;



    private String photo="guest-user.jpg";

    private String mezunyılı;
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    @OneToMany(mappedBy="user")
    private List<Note> notes;
    @ManyToOne
    @JoinColumn(name="departman_id")
    private Departman departman;

    private double diplomaNotu;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMezunyılı() {
        return mezunyılı;
    }

    public void setMezunyılı(String mezunyılı) {
        this.mezunyılı = mezunyılı;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }
}
