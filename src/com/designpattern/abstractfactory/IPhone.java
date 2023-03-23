package com.designpattern.abstractfactory;

public class IPhone extends Phone {
    public IPhone() {
        name = "iPhone";
    }

    public void prepare() {
        System.out.println("Creating " + name);
        System.out.println("Adding Apple Pay features");
    }
}
