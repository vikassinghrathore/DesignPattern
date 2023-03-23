package com.designpattern.abstractfactory;

public interface AbstractFactory {
    public Phone createPhone(String type);

    public Tablet createTablet(String type);
}
