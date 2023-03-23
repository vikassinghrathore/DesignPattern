package com.designpattern.abstractfactory;


public class DaoMaker {
	public static DaoFactory make(String type) {
		DaoFactory df = null;
		
		if (type.equals("xml")) {
			df = new XMLDaoFactory();
		} else if (type.equals("db")) {
			df = new DBDaoFactory();
		}
		return df;
	}
}
