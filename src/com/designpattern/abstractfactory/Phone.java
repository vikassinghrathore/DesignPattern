package com.designpattern.abstractfactory;

public abstract class Phone {
    String name;

    void prepare() {
        System.out.println("\nCreating "+ name);
    }
}