package com.todolist2.service;

import com.todolist2.todolistmodel.ToDoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToDoService {
    List<ToDoModel> findAll();
}
