package com.smelk.classesTypes.innerClass;

public class InnerClass {

    public void additionAndDivide(int firstNumber, int secondNumber) {
        Inner inner = new Inner();
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Divide: " + inner.divide(firstNumber, secondNumber));
    }

    public class Inner {
        public int divide(int firstNumber, int secondNumber) {
            return (firstNumber / secondNumber);
        }
    }
}