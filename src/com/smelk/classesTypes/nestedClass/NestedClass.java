package com.smelk.classesTypes.nestedClass;

public class NestedClass {

    public void addition(int firstValue, int secondValue) {
        System.out.println("Addition: " + (firstValue + secondValue));

    }

    static class Nested {
        public void divide(int firstValue, int secondValue) {
            System.out.println("Divide: " + (firstValue / secondValue));
        }
    }
}