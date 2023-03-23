package com.designpattern.singalton;

public enum EnumSingleTon {
    INSTANCE;

    // add sinlgeton methods
    public void method() {
        System.out.println("SingleTon Method");
    }
}

class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleTon.INSTANCE.method();
    }
}

