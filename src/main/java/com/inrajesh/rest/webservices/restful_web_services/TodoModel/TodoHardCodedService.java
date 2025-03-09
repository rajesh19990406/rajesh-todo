package com.inrajesh.rest.webservices.restful_web_services.TodoModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class TodoHardCodedService {

    private static List<Todo> todos=new ArrayList();
    private static int idCounter=0;

    static{
        todos.add(new Todo(++idCounter,"Rajesh","Cristiano Ronaldo", new Date(), false) );
        todos.add(new Todo(++idCounter,"Rajesh","Ronaldo is the beast", new Date(), false) );
        todos.add(new Todo(++idCounter,"Rajesh","nobody is greater than you", new Date(), false) );
        todos.add(new Todo(++idCounter,"Rajesh","you are the best", new Date(), false) );
    }
    public List<Todo> findAll(String username){
        return todos;
    }

    public Todo deleteById(long id){
        Todo todo =findById(id);
        if(todo==null) return null;

        if(todos.remove(todo)) {
            todos.remove(todo);
        }
        return null;
    }

    private Todo findById(long id) {
        for(Todo todo: todos){
            if(todo.getId()==id){
                return todo;
            }
        }
        return null;
    }
}
