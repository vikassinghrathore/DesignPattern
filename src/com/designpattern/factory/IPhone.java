package com.designpattern.factory;

public class IPhone  extends  AppleProduct{
    public IPhone(){
        name = "iPhone";
    }

    public void prepare(){
        System.out.println("Creating "+ name);
        System.out.println("Adding Apple Pay features");
    }
}

