package com.example.demo.repository;

import com.example.demo.TodoListItem;

import org.springframework.data.repository.CrudRepository;

public interface TodoListItemRespository extends CrudRepository<TodoListItem, Integer> {
    
}