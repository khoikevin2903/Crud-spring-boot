package com.example.todolist;

import com.example.todolist.model.dto.ToDoItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/lists")
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    @GetMapping("")
    public ResponseEntity<?>getLists(){
        List<ToDoItemDto> toDoItems = toDoListService.getLists();
        return ResponseEntity.ok(toDoItems);
    }

    @PostMapping("")
    public ResponseEntity<?> createItem(@RequestBody ToDoItemDto item){
        ToDoItemDto result = toDoListService.addItem(item);
        return ResponseEntity.ok(result);
    }

    @PutMapping("")
    public ResponseEntity<?>updateItem(@RequestBody ToDoItemDto item){
        ToDoItemDto result = toDoListService.updateItem(item);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>getItemById(@PathVariable int id){
        Optional<ToDoItemDto> result = toDoListService.getItemById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{id}")
    public void deleteItemById(@RequestBody ToDoItemDto item){
        toDoListService.deleteItem(item);
    }
}
