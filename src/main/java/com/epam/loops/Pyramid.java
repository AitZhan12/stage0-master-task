package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int num = 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
