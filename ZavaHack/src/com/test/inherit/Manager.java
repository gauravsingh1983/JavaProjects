package com.test.inherit;

import java.io.Serializable;

public class Manager extends Employee implements Person, MultipleInherit, Serializable
{
	protected String designation;

	Manager(){}
	
	public Manager(String name, Integer age, String department, String designation)
	{
		//this();
		super(name, age, department);
		this.designation = designation;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Manager [designation=" + designation + "name=" + name + ", age=" + age + ", department=" + department + "]";
	}



	@Override
	public void getDetails()
	{
		System.out.println("Manager Details : " + this.toString());
		//return null;
	}
	
	@Override
	protected void getDetails(String a)
	{
		// TODO Auto-generated method stub
		super.getDetails(a);
	}
	
	protected void getDetails(Integer a)
	{
		// TODO Auto-generated method stub
		//super.getDetails(a);
	}
	 
	protected void getDetails(String a, Integer b)
	{
		// TODO Auto-generated method stub
		super.getDetails(a);
	}
	
	protected void getDetails(Integer b , String a )
	{
		// TODO Auto-generated method stub
		super.getDetails(a);
	} 
	
	public void testGetAnotherDetail()
	{
		System.out.println("in method :: testGetAnotherDetail()");
	}

}
