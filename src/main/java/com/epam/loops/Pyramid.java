package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces
            for (int s = 1; s <= cathetusLength - i; s++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in descending order (excluding the first number)
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
