package controller;

import model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.TutorialRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController

@RequestMapping(value = "/api")
public class TutorialController {

    @Autowired
    TutorialRepository tutorialRepository;

    @GetMapping("/tutorials")
    public ResponseEntity<String> getAllTutorials(@RequestParam(required = false) String title) {
    // ...
        return new ResponseEntity<String>("/tutorials/",HttpStatus.OK);
    }

    @GetMapping(value = "/tutorials/{id}")
    public ResponseEntity<String> getTutorialById(@PathVariable("id") long id) {
        // ...
        return new ResponseEntity<String>("/tutorials/"+id,HttpStatus.OK);
    }

    @PostMapping(value ="/tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        // ...
        return new ResponseEntity<Tutorial>(new Tutorial(), HttpStatus.OK);
    }

    @PutMapping(value ="/tutorials/{id}")
    public ResponseEntity<String> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    // ...
        return new ResponseEntity<>("/updateTutorial/"+id,HttpStatus.OK);
    }

    @DeleteMapping(value ="/tutorials/{id}")
    public ResponseEntity<String> deleteTutorial(@PathVariable("id") long id) {
    // ...
        return new ResponseEntity<>("/tutorials/"+id,HttpStatus.OK);
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<String> deleteAllTutorials() {
    // ...
        return new ResponseEntity<>("/tutorials",HttpStatus.OK);
    }

    @GetMapping(value ="/tutorials/published")
    public ResponseEntity<String> findByPublished() {
    // ...
        return new ResponseEntity<>("/tutorials/published",HttpStatus.OK);
    }
}
