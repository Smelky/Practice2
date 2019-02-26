package com.smelk.classestypes.nested;

public class Main {

    public static void main(String[] args) {
        NestedTest nestedClass = new NestedTest();
        NestedTest.Nested nested = new NestedTest.Nested();
        nestedClass.addition(2, 1);
        nested.divide(2, 2);
    }
}