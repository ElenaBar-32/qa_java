package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) { // Feline реализует интерфейс Predator
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
