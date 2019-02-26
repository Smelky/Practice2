package com.smelk.classesTypes.localClass;

public class LocalClass {

    public void methodWithlocalClass() {
        int value = 5;

        class Local {
            public void print() {
                System.out.println(value);
            }
        }
        Local local = new Local();
        local.print();
    }
}