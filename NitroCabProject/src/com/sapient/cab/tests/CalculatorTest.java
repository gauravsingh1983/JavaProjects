package com.sapient.cab.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.sapient.cab.util.Calculator;
import com.sapient.cab.util.Constants;

public class CalculatorTest {
	
	
	public void testGetDistance()
	{
		
	}
	
	@Test
	public void testGetProfit()
	{
		assertEquals(100.0, Calculator.getProfit(5), 0.0);
	}
	
	@Test
	public void testGetCost()
	{
		assertEquals(10.0, Calculator.getCost(2),0.0);
	}
	
	public void testGetTimeToTravel()
	{
		
	}

}
