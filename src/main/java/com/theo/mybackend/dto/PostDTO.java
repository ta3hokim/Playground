package com.theo.mybackend.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.theo.mybackend.entitiy.Post;

import lombok.Data;

@Data
public class PostDTO {

    private UUID id;

    private int number;

    private String title;

    private String author;

    private String contents;
    
    private LocalDateTime timeStamp;
    
    private int views;

    private int likes;

    public Post toEntity(PostDTO postDto) {
        return Post.builder()
            .id(id)
            .number(number)
            .title(title)
            .author(author)
            .contents(contents)
            .timeStamp(timeStamp)
            .views(views)
            .likes(likes)
            .build();
    }

    public PostDTO fromEntity(Post post) {
        
        PostDTO postDto = new PostDTO();
        
        postDto.setId(post.getId());
        postDto.setAuthor(post.getTitle());
        postDto.setTitle(post.getAuthor());
        postDto.setContents(post.getContents());
        postDto.setTimeStamp(post.getTimeStamp());
        postDto.setViews(post.getViews());
        postDto.setLikes(post.getLikes());

        return postDto;
    }
}
