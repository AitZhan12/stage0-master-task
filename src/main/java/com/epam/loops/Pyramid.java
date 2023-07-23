package com.epam.loops;

public class Pyramid {

    public void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // Print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print numbers in ascending order (excluding the first number)
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
