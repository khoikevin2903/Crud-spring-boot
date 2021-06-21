package com.example.todolist;

import com.example.todolist.model.dto.ToDoItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoItemDto, Integer> {
}
