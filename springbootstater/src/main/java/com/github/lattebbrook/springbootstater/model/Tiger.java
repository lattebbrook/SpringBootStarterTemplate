package com.github.lattebbrook.springbootstater.model;

import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger extends Animal {
    public Tiger() {
        this.name = "Tiger";
        this.age = 5;
        this.description = "A fierce carnivore.";
    }
}
