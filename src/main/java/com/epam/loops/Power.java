package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        for (int i = 1; i <= power; i++) {
            power *= numberToPrint;
        }

        System.out.println(power);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
