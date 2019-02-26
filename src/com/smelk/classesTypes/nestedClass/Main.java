package com.smelk.classesTypes.nestedClass;

public class Main {

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        NestedClass.Nested nested = new NestedClass.Nested();
        nestedClass.addition(2, 1);
        nested.divide(2, 2);
    }
}