package com.example.Sem5DZ.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;



@Entity
@Data
@Table(name="tasks")
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
