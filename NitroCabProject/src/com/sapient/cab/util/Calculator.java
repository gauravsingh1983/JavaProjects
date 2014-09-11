package com.sapient.cab.util;

import java.util.Date;

public class Calculator {

	
	public static double getDistance(long initArea, long pickupArea, long dropArea)
	{
		return Math.abs((initArea-pickupArea)+(pickupArea-dropArea));
	}
	
	public static double getCost(double distaneTrvld)
	{
		return 5.0*distaneTrvld;
	}
	
	public static double getProfit(double distaneTrvld)
	{
		return ((Constants.FARE*distaneTrvld - getCost(distaneTrvld))/getCost(distaneTrvld))*100;
	}
	
	public static double getTimeToTravel(double distance)
	{
		return (distance*2)+15;
	}
	
	
	public static long getTimeDiff(Date pickdate1, Date requestdate2)
	{
		return ((pickdate1.getTime() - requestdate2.getTime())/(1000*60));
	}
}
