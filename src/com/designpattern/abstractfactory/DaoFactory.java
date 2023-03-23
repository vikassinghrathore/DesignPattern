package com.designpattern.abstractfactory;

 public interface DaoFactory {

	public void getDao();

	Dao createDao(String type);

}
