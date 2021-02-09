package com.example.mezunsistemi.repository;

import com.example.mezunsistemi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    User findByEmail(String email);
    User findByEmailOrTcKimlikNo(String email, String tcKimlikNo);

}
