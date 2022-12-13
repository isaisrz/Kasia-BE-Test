package com.blog.app.task.service;

import com.blog.app.task.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface UserService {

    /**
     *
     * Register a user
     *
     * **/
    void register(User user);

    /**
     *
     * Get all users (paginated)
     *
     * **/
    Collection<User> findAllUsers(int page, int size);

    /**
     * Find a user by email
     */
    User findUserByMail(String email);

}
