package com.test.singleton;

public class SingletonEarly {
	 
    private final static SingletonEarly instance = new SingletonEarly();
 
    private SingletonEarly() {
    	System.out.println("Hello Gaurav");
    }
 
    public static SingletonEarly getInstance() {
        return instance;
    }
    
    public void doSomething()
    {
    	System.out.println("Hello World!!");
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
    	SingletonEarly se = (SingletonEarly) super.clone();
    	return se;
    }
 
}