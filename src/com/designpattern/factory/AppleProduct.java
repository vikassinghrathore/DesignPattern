package com.designpattern.factory;

public abstract class AppleProduct {

    String name;

    void prepare() {
        System.out.println("\nCreating " + name);
    }
}

