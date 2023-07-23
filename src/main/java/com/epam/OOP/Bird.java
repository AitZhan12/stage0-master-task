package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return super.getDescription(color, numberOfPaws, hasFur) + " Moreover, it has 2 wings and can fly.";
    }
}
