package com.test.inherit;

import java.io.File;

public class TestInherit
{

	public void getEmployeeDetails(Employee employee)
	{
		if(employee instanceof Manager)
		{
			Manager m = (Manager) employee;
			m.testGetAnotherDetail();
		}
		if(employee instanceof Engineer)
		{
			Engineer engineer = (Engineer) employee;
			engineer.getDetails("null");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Employee employee = new Employee("vipin", 25, "HR");
		//employee.getDetails();
		//Manager manager = new Manager("gaurav", 30, "HR", "Manager");
		//manager.getDetails();
		//manager.testGetAnotherDetail();
		
		Employee manager = (Employee)new Manager("Rajiv", 30, "HR", "Manager");
		
		//manager.testGetAnotherDetail();
		
		//Employee engineer = new Engineer();

		//TestInherit inherit = new TestInherit();
		
		/*try
		{
		
		inherit.getEmployeeDetails(engineer);
		
		inherit.getEmployeeDetails(manager);
		
		//DB Close Connection
		
		//File f = new File("");
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Null Value Exception has occured !! Kindly provide a valid name !!");
		}
		finally
		{
			System.out.println("DB Connection closed");
		}*/
		
	
	}

}
