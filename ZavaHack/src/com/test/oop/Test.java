package com.test.oop;


public class Test
{
public static void f()
{
	System.out.println("hh");
}

static String func(Object x, Object y) {
    return (x == y) + " " + x.equals(y) + " " + (x.hashCode() == y.hashCode());
}
	public static void main(String[] args) throws Exception {

		   try {
			
		//System.out.println(func("test", "test"));
			   
			   //System.out.println(1>>>-44);
			   System.out.println(1>>2);
			   System.out.println(1>>>8);
		
		
		   }catch (Exception e) {
		        throw e;
		   }

		}
}
