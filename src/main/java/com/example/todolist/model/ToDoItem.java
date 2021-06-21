package com.example.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ToDoItem {
    private  int id;
    private  String name;
    private  Boolean status;
    private String email;
    public boolean active;
}
