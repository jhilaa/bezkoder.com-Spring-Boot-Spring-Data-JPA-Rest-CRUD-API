package controller;

import model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.TutorialRepository;

@CrossOrigin(origins = "http://localhost:8081")

@RestController
public class TestController {
    @GetMapping(value = "/demo")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @GetMapping(value = "/getdata/{data}")
    public String getdata(){
        return "Hello World from Spring Boot";
    }
}
