package com.smelk.classestypes.local;

public class LocalTest {

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