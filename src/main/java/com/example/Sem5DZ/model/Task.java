package com.example.Sem5DZ.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column( nullable=false)
    private String description;



    @Column( nullable=false)
    private TaskStatus status;


    @Column( nullable=false)
    @CreationTimestamp
    private LocalDateTime createdAt;
}
