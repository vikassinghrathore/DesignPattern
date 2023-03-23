package com.designpattern.factory;

public class AppleProductFactory {
    public AppleProduct createProduct(String type){
        AppleProduct product = null;

        if(type.equalsIgnoreCase("phone"))
            product = new IPhone();
        else if (type.equalsIgnoreCase("tablet"))
            product = new IPad();
        return product;
    }
}
