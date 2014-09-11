package com.test.factory;


public class DAOFactoryTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("application.dao.class", JDBCApplicationDAO.class.getName());
		DAO dao = (DAO) DAOFactory.createDAO(System.getProperty("application.dao.class"));
		System.out.println(dao.doSomething());
	}
	
	

}
