package com.mongodb.todoCrud.controller;

import com.mongodb.todoCrud.model.TodoModel;
import com.mongodb.todoCrud.repo.TodoRepo;
import com.mongodb.todoCrud.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    //create the instance of the service
    @Autowired
    private TodoService service;
    @Autowired
    private TodoRepo todoRepo;

    //to add the todo
    @PostMapping()
    public TodoModel addTodo(@RequestBody TodoModel model)
    {
        return service.addTodo(model);
    }

    @GetMapping()
    public List<TodoModel> getAllTodos()
    {
        return service.getAllTodo();
    }

    @DeleteMapping(value = "/{todoId}")
    public void deleteTodo(@PathVariable("todoId") String todoId)
    {
        service.deleteTodo(todoId);
    }

    @PutMapping(value = "/{todoId}")
    public TodoModel updateTodo(@PathVariable("todoId") String todoId, @RequestBody TodoModel model){
        return service.updateTodo(todoId, model);
    }
}
