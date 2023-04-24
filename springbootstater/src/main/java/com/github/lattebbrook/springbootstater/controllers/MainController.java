package com.github.lattebbrook.springbootstater.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.lattebbrook.springbootstater.model.Animal;

@RestController
public class MainController {
    @Autowired @Qualifier("tiger")
    private Animal tiger;
    
    @Autowired @Qualifier("capybara")
    private Animal capybara;
    
    @RequestMapping("/animal/{animalName}")
    public Animal getAnimal(@PathVariable String animalName) {
        Animal animal = null;
        if (animalName.equals("tiger")) {
            animal = tiger;
        } else if (animalName.equals("capybara")) {
            animal = capybara;
        }
        return animal;
    }
}

//http://localhost:8080/check?key=$first&value=5

@RestController
class TestController {

    @PostMapping("/check")
    public ResponseEntity<String> test(@RequestParam String key, @RequestParam int value) {
        int result;
        if (key.equals("first")) {
            result = value + 5;
        } else if (key.equals("second")) {
            result = value + 10;
        } else {
            return ResponseEntity.badRequest().body("Invalid key: " + key);
        }
        return ResponseEntity.ok("Result: " + result);
    }
}