package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;


@Data
@Entity
public class TodoList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "todolist")
    private List<TodoListItem> todolistitem;

    public TodoList(Object object, String string) {
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
