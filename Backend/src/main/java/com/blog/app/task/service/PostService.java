package com.blog.app.task.service;


import com.blog.app.task.model.Comment;
import com.blog.app.task.model.Post;
import com.blog.app.task.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

/***
 *
 *  TODO:
 *
 * **/
@Service
public interface PostService {

    /**
     *
     * Create a post with a given user id in the request
     *
     * **/
    void createPost(int userId);


    /***
     *
     * Get a post's information and register a visit to it
     *
     * **/
    Post visit();

    /**
     *
     * Get all posts made by a given user (paginated)
     *
     * **/
    Collection<Post> getAllByUser(int page, int size);

    /**
     * Add a comment to a post
     */
    void addComment(User author, Post post, String content);

}
