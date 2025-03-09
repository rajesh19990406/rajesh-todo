package com.inrajesh.rest.webservices.restful_web_services.Hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class worldController {


    @GetMapping("/hello")
    public String great(){
        return "Hello world";
    }

    @GetMapping("/hello-bean")
    public greatBean greatBean(){

        return new greatBean("Hello world welcome rajesh");
    }

    @GetMapping("/hello-bean/path-variable/{name}")
    public greatBean greatBean(@PathVariable String name){
        return new  greatBean(String.format("Hello world welcome rajesh, %s",name));
    }




}
