package com.smelk.classes.types.inner;

public class Main {

    public static void main(String[] args) {
        InnerTest innerClass = new InnerTest();
        innerClass.additionAndDivide(2, 2);
        InnerTest.Inner inner = new InnerTest().new Inner();
        System.out.println(inner.divide(2, 2));
    }
}