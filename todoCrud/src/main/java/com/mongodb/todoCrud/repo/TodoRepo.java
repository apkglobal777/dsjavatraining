package com.mongodb.todoCrud.repo;

import com.mongodb.todoCrud.model.TodoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepo extends MongoRepository<TodoModel, String> {

    @Override
    List<TodoModel> findAll();
}
