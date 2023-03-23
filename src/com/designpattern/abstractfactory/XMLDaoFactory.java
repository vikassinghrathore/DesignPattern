package com.designpattern.abstractfactory;

public class XMLDaoFactory implements DaoFactory {

	public Dao createDao(String type) {
		Dao dao = null;
		if (type.equals("Emp")) {
			dao = new XMLEmpDao();
		} else if (type.equals("Dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

	@Override
	public void getDao() {

	}
}
