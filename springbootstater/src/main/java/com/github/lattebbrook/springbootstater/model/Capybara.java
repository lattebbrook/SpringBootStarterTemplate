package com.github.lattebbrook.springbootstater.model;

import org.springframework.stereotype.Component;

@Component("capybara")
public class Capybara extends Animal {
    public Capybara() {
        this.name = "Capybara";
        this.age = 3;
        this.description = "A friendly herbivore.";
    }
}
