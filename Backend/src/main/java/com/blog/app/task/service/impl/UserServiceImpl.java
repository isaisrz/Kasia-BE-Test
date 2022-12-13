package com.blog.app.task.service.impl;

import com.blog.app.task.service.UserService;
import com.blog.app.task.model.User;
import com.blog.app.task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

/**
 *
 *  CLASS USER SERVICE
 *
 * ****/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(User user) {

    }

    @Override
    public Collection<User> findAllUsers(int page, int size) {
        return null;
    }

    @Override
    public User findUserByMail(String email) {
        return null;
    }
}
