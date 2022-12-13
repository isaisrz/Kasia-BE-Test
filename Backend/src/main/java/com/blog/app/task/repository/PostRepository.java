package com.blog.app.task.repository;

import com.blog.app.task.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {



}
