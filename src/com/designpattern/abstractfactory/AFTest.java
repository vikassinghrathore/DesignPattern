package com.designpattern.abstractfactory;


public class AFTest {

    public static void main(String[] args) {
        DaoFactory daoFactory = null;
        Dao dao = null;

        daoFactory = DaoMaker.make("XML");
        dao=daoFactory.createDao("EMP");
        dao.save();
    }

}
