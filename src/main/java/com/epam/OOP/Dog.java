package com.epam.OOP;

public class Dog extends Animal {

    public Dog() {
        super("brown", 5, true);
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return super.getDescription("brown", 5, true);
    }
}
