package com.designpattern.factory;

public class FactoryPatternTest {

    public static void main(String[] args) {

        //Create Factory
        AppleProductFactory factory = new AppleProductFactory();

        //Create product using Factory
        AppleProduct product = factory.createProduct("phone");
        product.prepare();

        //Create product using Factory
        product = factory.createProduct("tablet");
        product.prepare();
    }
}
