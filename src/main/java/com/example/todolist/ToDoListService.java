package com.example.todolist;


import com.example.todolist.model.dto.ToDoItemDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ToDoListService {

    public List<ToDoItemDto> getLists();

    public Optional<ToDoItemDto> getItemById(int id);

    public ToDoItemDto addItem(ToDoItemDto item);

    public ToDoItemDto updateItem(ToDoItemDto item);

    public void deleteItem(ToDoItemDto id);

}
