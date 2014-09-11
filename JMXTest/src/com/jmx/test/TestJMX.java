package com.jmx.test;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class TestJMX implements TestJMXMBean
{
	
	private  static int instanceCount = 1;

	@Override
	public int getInstanceCount()
	{
		// TODO Auto-generated method stub
		return ++instanceCount;
	}

	public static void main(String[] args) throws Exception
	{
		 MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		 TestJMXMBean jmxmBean = new TestJMX();
		 ObjectName name = new ObjectName("com.jmx.test:type=TestJMXMBean");
		 mbs.registerMBean(jmxmBean, name);
		 
		 while(TestJMX.instanceCount>0)
		 {
			 System.out.println("Hello Gaurav");
		 }
	}
}
