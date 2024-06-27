package com.theo.mybackend.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theo.mybackend.dto.PostDTO;
import com.theo.mybackend.entitiy.Post;
import com.theo.mybackend.repository.PostRepository;
import com.theo.mybackend.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }
    
    @GetMapping("/list")
    public List<PostDTO> postListAuthor(@RequestParam String author){

        List<Post> posts = postService.getListByAuthor(author);
        // 변환된 DTO 리스트 생성
        List<PostDTO> dtos = posts.stream()
                                  .map(post -> new PostDTO().fromEntity(post))
                                  .collect(Collectors.toList());
        return dtos;
    }
}
