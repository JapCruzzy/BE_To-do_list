package com.todolist2.repository;

import com.todolist2.todolistmodel.ToDoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoModel, Long> {
}
