package com.test.inherit;

public class Employee implements Person, MultipleInherit
{

	protected String name;
	protected Integer age;
	protected String department;
	
	
	public Employee()
	{}
	
	public Employee(String name, Integer age, String department)
	{
		//super();
		this.name = name;
		this.age = age;
		this.department = department;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}


	protected void getDetails()
	{
		System.out.println("Employee Details : " + this.toString());
	}
	
	protected void getDetails(String a) throws RuntimeException
	{
		if("null".equals(a))
			throw new NullValueException();
		
		System.out.println(a + "::Employee Details : " + this.toString());
	}



	@Override
	public void testInheritability()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPersonById()
	{
		// TODO Auto-generated method stub
		
	}

}
