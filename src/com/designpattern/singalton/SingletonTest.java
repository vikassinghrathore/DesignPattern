package com.designpattern.singalton;

public class SingletonTest {
    public static void main(String[] args) {
        DateUtil du1 = DateUtil.getInstance();
        DateUtil du2 = DateUtil.getInstance();
        System.out.println(du1 == du2);
        System.out.println("du1 == du2 : ? " + (du1 == du2));
        System.out.println(du1.hashCode());
        System.out.println(du2.hashCode());

    }
}