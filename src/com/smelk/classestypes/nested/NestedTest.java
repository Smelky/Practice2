package com.smelk.classestypes.nested;

public class NestedTest {

    public void addition(int firstValue, int secondValue) {
        System.out.println("Addition: " + (firstValue + secondValue));

    }

    static class Nested {
        public void divide(int firstValue, int secondValue) {
            System.out.println("Divide: " + (firstValue / secondValue));
        }
    }
}