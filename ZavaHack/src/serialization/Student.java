package serialization;

import java.io.Serializable;

public class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	public static String testValue = "India";
	int							id;
	String						name;
	Marks						marks;

	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, Marks marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}