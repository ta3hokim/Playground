package com.theo.mybackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theo.mybackend.entitiy.Post;
import com.theo.mybackend.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public List<Post> getListByAuthor(String author) {
        return postRepository.findPostByAuthor(author);
    }

}
