package com.example.mezunsistemi.service;

import com.example.mezunsistemi.model.Role;
import com.example.mezunsistemi.model.User;
import com.example.mezunsistemi.repository.RoleRepository;
import com.example.mezunsistemi.repository.UserRepository;
import com.example.mezunsistemi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private NoteRepository noteRepository;


    public User findByUserName(String email){

        return userRepository.findByEmail(email);
    }
    public void save(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        user.setPhoto("guest-user.jpg");
        Role userRole = roleRepository.findByName("STUDENT");
        user.setRole(userRole);

        userRepository.save(user);
    }


    public void update(Long id,User user){

        User updated = userRepository.getOne(id);

        updated.setName(user.getName());
        updated.setSurname(user.getSurname());
        updated.setEmail(user.getEmail());


        userRepository.save(updated);
    }

//    public List<User> listAllUser(){
//        return userRepository.findAll();
//    }

    public User getById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> listAllStudent(){
        Role role =  roleRepository.findByName("STUDENT");
        return userRepository.findAll().stream().filter(user -> user.getRole().equals(role) ).collect(Collectors.toList());
    }

    public  User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}

