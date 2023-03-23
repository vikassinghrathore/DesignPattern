package com.designpattern.abstractfactory;

public class SamsungPhone extends Phone {
    public SamsungPhone() {
        name = "Samsung Phone";
    }

    public void prepare() {
        System.out.println("Creating " + name);
        System.out.println("Adding Samsung Pay features");
    }
}
