package com.task.service.impl;

import com.task.dto.AuthenticationRequest;
import com.task.dto.AuthenticationResponse;
import com.task.dto.RegisterRequest;
import com.task.model.Role;
import com.task.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    public AuthenticationResponse register(RegisterRequest request) {
        User user = new User()
                .setUsername(request.getUsername())
                .setEmail(request.getEmail())
                .setPassword(passwordEncoder.encode(request.getPassword()))
                .setRole(Role.USER);
    userService.createUser(user);
    var jwtToken = jwtService.generateToken(user);
    return new AuthenticationResponse()
            .setToken(jwtToken);
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    request.getUsername(),
                    request.getPassword()
                )
        );
        var user = userService.findByUsername(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return new AuthenticationResponse()
                .setToken(jwtToken);

    }

    }

