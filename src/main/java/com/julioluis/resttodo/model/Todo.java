package com.julioluis.resttodo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "description")
    private String name;
    @Column(name = "is_done")
    private boolean done;
}
