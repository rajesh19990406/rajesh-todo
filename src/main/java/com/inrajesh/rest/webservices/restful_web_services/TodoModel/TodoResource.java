package com.inrajesh.rest.webservices.restful_web_services.TodoModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoResource {

    @Autowired
    public TodoHardCodedService todoService;



    @GetMapping("/users/{name}/todos")
    public List<Todo> getAllTodos(@PathVariable String name){
        return  todoService.findAll(name);
    }
    @DeleteMapping("/users/{nam}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String nam,
                                           @PathVariable long id){
       Todo todo= todoService.deleteById(id);
       if(todo!=null) {
           return ResponseEntity.noContent().build();
       }
        return ResponseEntity.notFound().build();
       }
    }


