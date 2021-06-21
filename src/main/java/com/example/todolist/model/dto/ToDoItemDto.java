package com.example.todolist.model.dto;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="todo")
public class ToDoItemDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String name;
    private  Boolean status;
    private String email;
    public boolean active;
}
