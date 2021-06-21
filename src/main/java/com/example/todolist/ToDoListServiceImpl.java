package com.example.todolist;

import com.example.todolist.model.dto.ToDoItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class ToDoListServiceImpl implements ToDoListService {
    private final ToDoListRepository toDoListRepository;

    @Override
    public List<ToDoItemDto> getLists() {
        List<ToDoItemDto> result = toDoListRepository.findAll();
        result =  result.stream().filter(rs -> rs.active == true).collect(Collectors.toList());
        return result;
    }

    @Override
    public Optional<ToDoItemDto> getItemById(int id) {
       Optional<ToDoItemDto> result = toDoListRepository.findById(id);
       return result;
    }

    @Override
    public ToDoItemDto addItem(ToDoItemDto item) {
        ToDoItemDto result = toDoListRepository.save(item);
        return result;
    }
    @Override
    public ToDoItemDto updateItem(ToDoItemDto item) {
        ToDoItemDto result = toDoListRepository.save(item);
        return result;
    }
    @Override
    public void deleteItem(ToDoItemDto item) {
        System.out.println(item);
        toDoListRepository.save(item);
    }


}
