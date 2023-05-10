package com.todolist2.controller;

import com.todolist2.service.ToDoService;
import com.todolist2.todolistmodel.ToDoModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/to-do-list")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/list")
    public List<ToDoModel> getToDoList(){
        return toDoService.findAll();
    }
}
