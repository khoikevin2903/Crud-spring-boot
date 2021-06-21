package com.example.todolist.model.mapper;

import com.example.todolist.model.ToDoItem;
import com.example.todolist.model.dto.ToDoItemDto;

public class ToDoItemMapper {
    public static ToDoItemDto toDoItemDto(ToDoItem toDoItem){
        ToDoItemDto tmp = new ToDoItemDto();
        tmp.setId(toDoItem.getId());
        tmp.setName(toDoItem.getName());
        tmp.setStatus(toDoItem.getStatus());
        tmp.setEmail(toDoItem.getEmail());
        return  tmp;
    }
}
