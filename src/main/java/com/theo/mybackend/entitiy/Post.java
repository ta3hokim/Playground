package com.theo.mybackend.entitiy;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    private int number;

    @NonNull
    private String title;

    @NonNull
    private String author;

    private String contents;
    
    @NonNull
    private LocalDateTime timeStamp;
    
    private int views;

    private int likes;
    
}
