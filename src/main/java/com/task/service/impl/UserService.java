package com.task.service.impl;

import com.task.repository.IUserRepository;
import com.task.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

}
