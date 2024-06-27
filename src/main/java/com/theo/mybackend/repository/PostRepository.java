package com.theo.mybackend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theo.mybackend.entitiy.Post;
import java.util.List;


public interface PostRepository extends JpaRepository<Post, UUID>{
    
    public List<Post> findPostByAuthor(String author);

    public List<Post> findPostByTitle(String title);
}
