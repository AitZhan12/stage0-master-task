package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int s = 1; s <= height - i; s++) {
                System.out.print("  ");
            }

            // Print stars (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
