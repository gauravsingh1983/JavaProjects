package test;

import java.text.ParseException;

import junit.framework.Assert;

import org.junit.Test;

import util.FlightUtil;

public class FlightUtilTest
{

	@Test
	public void testFlightDurationToDate()
	{
		FlightUtil foo = new FlightUtil();
		foo.flightDurationToDate("4.10");
		Assert.assertNotNull(foo.flightDurationToDate("4.10"));
		
	}
	
	@Test
	public void testFlightTimeToDate()
	{
		FlightUtil foo = new FlightUtil();
		System.out.println(foo.flightTimeToDate("0630"));
		Assert.assertNotNull(foo.flightTimeToDate("0630"));
		
	}
	
	@Test
	public void testflightValidTillToDate()
	{
		FlightUtil foo = new FlightUtil();
		try
		{
			System.out.println(foo.flightValidTillToDate("20-10-2010"));
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
