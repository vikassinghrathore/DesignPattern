package com.designpattern.singalton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
    // declare static member of same class-type in the class
    // declare static member instance volatile
    private static volatile DateUtil instance;

    // constructor declare as private
    private DateUtil() {
        //no operation done here
    }

    // declare a static method to create only one instance(static factory method)
    public static DateUtil getInstance() {
        // Double checking Locking
        //To implement DCL, you check a volatile field in the common path and only synchronize when necessary
        if (instance == null) {
            synchronized (DateUtil.class) {
                System.out.println("Checking DCL locked..");
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    // use read readResolve() deSerialized (avoid to creation of multiple objects)
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
