package com.designpattern.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryTesting {
    public static void main(String[] args) {

        // Create AbstractFactory
        AbstractFactory factory;
        Phone phone;
        Tablet tablet;
        String company ="";
        System.out.println("Enter company name");
        try (Scanner sc = new Scanner(System.in)) {
            company = sc.next();
        }

        if (company.equalsIgnoreCase("apple")) {
            factory = new AppleProductFactory();
            phone = factory.createPhone("phone");
            phone.prepare();
            tablet = factory.createTablet("tablet");
            tablet.prepare();
        } else if (company.equalsIgnoreCase("samsung")) {

            factory = new SamsungProductFactory();
            phone = factory.createPhone("phone");
            phone.prepare();
            tablet = factory.createTablet("tablet");
            tablet.prepare();
        } else {
            System.out.println("Not supported");
        }

    }
}
