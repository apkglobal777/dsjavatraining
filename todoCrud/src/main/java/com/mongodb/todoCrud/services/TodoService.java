package com.mongodb.todoCrud.services;

import com.mongodb.todoCrud.model.TodoModel;
import com.mongodb.todoCrud.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepo repo;

    public TodoModel addTodo(TodoModel model){
        repo.save(model);
        return model;
    }

    public List<TodoModel> getAllTodo(){
        return repo.findAll();
    }

    public TodoModel getTodoById(String todoId){
        return repo.findById(todoId).get();
    }

    public void deleteTodo(String todoId)
    {
        repo.deleteById(todoId);
    }

    public TodoModel updateTodo(String todoId, TodoModel model)
    {
        model.setId(todoId);
        repo.save(model);
        return model;
    }
}
