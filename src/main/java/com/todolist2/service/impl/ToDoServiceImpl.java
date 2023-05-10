package com.todolist2.service.impl;

import com.todolist2.repository.ToDoRepository;
import com.todolist2.service.ToDoService;
import com.todolist2.todolistmodel.ToDoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDoModel> findAll() {
        return (List<ToDoModel>) toDoRepository.findAll();
    }
}
