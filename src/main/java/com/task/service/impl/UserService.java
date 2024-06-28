package com.task.service.impl;

import com.task.model.User;
import com.task.repository.IUserRepository;
import com.task.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService<User> {
    @Autowired
    private IUserRepository userRepository;

    public void createUser(User user) {
        try {
            userRepository.save(user);

        } catch (Exception e) {
            String message = e.getMessage();
        }
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
