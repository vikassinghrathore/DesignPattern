package com.designpattern.abstractfactory;

public class DBDeptDao implements Dao {
    public void save() {

        System.out.println("Department written to table");
    }
}
