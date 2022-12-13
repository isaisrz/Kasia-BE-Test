package com.blog.app.task.service.impl;

import com.blog.app.task.model.Post;
import com.blog.app.task.model.User;
import com.blog.app.task.repository.PostRepository;
import com.blog.app.task.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;


    @Override
    public void createPost(int userId) {

    }

    @Override
    public Post visit() {
        return null;
    }

    @Override
    public Collection<Post> getAllByUser(int page, int size) {
        return null;
    }

    @Override
    public void addComment(User author, Post post, String content) {

    }
}
