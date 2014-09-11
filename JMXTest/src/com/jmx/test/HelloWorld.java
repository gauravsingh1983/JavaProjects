package com.jmx.test;

import java.lang.management.ManagementFactory;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.ReflectionException;

class A implements AMBean
{

	static int	i	= 0;
	private static int instance;

	@Override
	public void run()
	{
		long startTime = getStartTime();

		while (i < 1000000)
		{
			System.out.println("Say Hello !!!---->" + i);
			++i;
			instance = i;
		}

		System.out.println("Total time taken to execute Thread B:" + (System.currentTimeMillis() - startTime));
		
	}

	public Long getStartTime()
	{
		return System.currentTimeMillis();

	}


	@Override
	public int getInstance()
	{
		// TODO Auto-generated method stub
		return instance;
	}



}

/*class B implements HelloWorldMBean
{

	static int	i	= 0;
	private static int instance = i;


	public void run()
	{
		long startTime = getStartTime();

		while (i < 1000000)
		{
			System.out.println("Say GoodBye !!!---->" + i);
			++i;
		}

		System.out.println("Total time taken to execute Thread B:" + (System.currentTimeMillis() - startTime));
	}


	public Long getStartTime()
	{
		return System.currentTimeMillis();

	}


	public int getSayGoodByeCount()
	{
		// TODO Auto-generated method stub
		return i;
	}


	public int getSayHelloCount()
	{
		// TODO Auto-generated method stub
		return A.i;
	}


	@Override
	public int getInstance()
	{
		// TODO Auto-generated method stub
		return instance;
	}


}*/

public class HelloWorld
{


	public static void main(String[] args) throws Exception
	{
		// Get the MBean server
	    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		// register the MBean
		AMBean mBean1 = new A();


			ObjectName name1 = new ObjectName("com.jmx.test:type=HelloWorldMBean");
			//ObjectName name2 = new ObjectName("com.jmx.test:type=HelloWorldMBean");
			mbs.registerMBean(mBean1, name1);
			//mbs.registerMBean(mBean2, name2);

		//System.out.println(mBean1.getStartTime());
		mBean1.run();
		//b.run();
		

	}
}
