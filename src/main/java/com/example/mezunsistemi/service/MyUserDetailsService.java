package com.example.mezunsistemi.service;

import com.example.mezunsistemi.MyUserPrincipal;
import com.example.mezunsistemi.model.User;
import com.example.mezunsistemi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmailOrTcKimlikNo(email,email);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new MyUserPrincipal(user);
    }

}
