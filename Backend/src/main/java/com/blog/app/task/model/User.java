package com.blog.app.task.model;


import java.sql.Timestamp;

/**
 * TODO: Add the proper Spring annotations to the entity and its fields
 */

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
