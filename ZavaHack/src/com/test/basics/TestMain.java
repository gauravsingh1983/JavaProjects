package com.test.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.test.newbasic.A;
import com.test.newbasic.B;

class testPrivate
{
}

public class TestMain extends A
{

	public static Map<String, Customer>	testMap			= new HashMap<String, Customer>();

	public static List<?>				customerList	= new ArrayList();

	public int doNothing()
	{
		return i;
	}

	public static void main(String[] args)
	{
		System.out.println(Boolean.parseBoolean("true"));
		/*
		 * Customer.doSomething();
		 * 
		 * Customer c1 = new Customer("Vipin", 30); Customer c2 = new
		 * Customer("Gaurav", 30);
		 * 
		 * //testMap.put("c1", c1); //testMap.put("c2", c2);
		 * 
		 * //customerList.add(c1); //customerList.add(c2);
		 * 
		 * //Set keySet = testMap.keySet();
		 * 
		 * System.out.println(customerList);
		 * 
		 * Iterator a = customerList.iterator();
		 * 
		 * Customer ctmr = null; String key = null;
		 * 
		 * while(a.hasNext()) { ///key = (String)a.next(); ctmr = (Customer)
		 * a.next(); System.out.println(ctmr); }
		 * 
		 * 
		 * if(c1.equals(c2)) { System.out.println("objects are equal"); } else {
		 * System.out.println("objects are unequal"); }
		 * System.out.println("HelloWorld !!"); A a = null; a = new
		 * A(5,"vipin");
		 * 
		 * A b = new A(a);
		 * 
		 * B c = new B(5,"vipin"); //a.doSomethingNew();
		 * 
		 * //a.setName("Vipin"); System.out.println(b.getName());
		 * System.out.println(b.getI()); c.doSomething(); //new B().
		 * 
		 * 
		 * 
		 * String test = "Vipin"; String test1 = new String("Vipin");
		 * if(test.equals(test1)){ System.out.println("String are equal"); }else
		 * { System.out.println("String are unequal"); }
		 */}
}
