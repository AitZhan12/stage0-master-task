package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

}
