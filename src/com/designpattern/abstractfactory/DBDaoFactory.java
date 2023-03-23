package com.designpattern.abstractfactory;

public class DBDaoFactory implements DaoFactory {

    public Dao createDao(String type) {

        Dao dao = null;
        if (type.equals("Emp")) {
            dao = new DBEmpDao();
        } else if (type.equals("Dept")) {
            dao = new DBDeptDao();
        }
        return dao;
    }

    @Override
    public void getDao() {

    }

}