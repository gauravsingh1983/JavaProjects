
package com.test.basics;

public class Customer extends T
{

 public String name;
 public int age;
 

 
public Customer(String name, int age)
{
	super();
	this.name = name;
	this.age = age;
}


public static void doSomething()
{
	System.out.println("Test static method");
}



/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString()
{
	return "Customer [name=" + name + ", age=" + age + "]";
}


/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode()
{
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (age != other.age)
		return false;
	if (name == null)
	{
		if (other.name != null)
			return false;
	}
	else if (!name.equals(other.name))
		return false;
	return true;
}
 
 

}
