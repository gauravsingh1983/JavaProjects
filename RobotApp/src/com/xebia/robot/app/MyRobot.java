package com.xebia.robot.app;

import java.util.HashMap;
import java.util.Map;

import com.xebia.robot.exceptions.PowerException;
import com.xebia.robot.util.Distance;
import com.xebia.robot.util.Power;
import com.xebia.robot.util.PowerUtil;
import com.xebia.robot.util.RobotConstants;
import com.xebia.robot.util.Weight;

public class MyRobot implements Robot
{

	protected Weight	weight	= new Weight(0);

	protected Distance	distance;

	protected Power		power;

	protected Map<String, String> currentStatus = new HashMap<String, String>();
	
	static int			meter	= 100;
	int					counter	= 100;
	int 				initDist = 0;
	double 				remPower = 0;

	public MyRobot()
	{
		super();
		System.out.println("My Robot Created");
	}

	public MyRobot(Weight weight, Distance distance)
	{
		super();
		this.weight = weight;
		this.distance = distance;
	}

	@Override
	public String walk()
	{

		String msg = "";
		if (power.getPower() > 0)
		{
			if (weight.getWeight() > 0)
			{
				currentStatus.put("distanceToTravel", distance.getDistance()+"");
				currentStatus.put("weightToCarry", weight.getWeight()+"");

				this.walk(getWeight(), getDistance());
			}
			else if (distance.getDistance() > 0)
			{
				currentStatus.put("distanceToTravel", distance.getDistance()+"");
				this.walk(getDistance());
			}
		}
		else
		{
			throw new PowerException("LOW POWER! charge battery");
		}

		return msg;
	}

	public Weight getWeight()
	{
		return weight;
	}

	public void setWeight(Weight weight)
	{
		this.weight = weight;
	}

	public Distance getDistance()
	{
		return distance;
	}

	public void setDistance(Distance distance)
	{
		this.distance = distance;
	}

	public Power getPower()
	{
		return power;
	}

	public void setPower(Power power)
	{
		this.power = power;
	}

	@Override
	public void walk(Weight weight)
	{
		// TODO Auto-generated method stub
		// return null;
	}

	@Override
	public void walk(Weight weight, Distance dist)
	{
		
		double remDistInMeters = distance.getDistance();

		while (meter < remDistInMeters)
		{
			meter += counter;
			
			System.out.println("My Robot is walking");

			System.out.println("My Robot walked for " + meter + " mtrs");
			
			remDistInMeters = (Double.parseDouble(currentStatus.get("distanceToTravel"))-meter);

			//System.out.println("remaining distance :" +  (Double.parseDouble(currentStatus.get("distanceToTravel"))-meter));
			System.out.println("remaining distance :" +  remDistInMeters);

			distance.setDistance(remDistInMeters);
			remPower = PowerUtil.calculateRemainingPower(weight.getWeight(), meter);
			System.out.println("remaining power : "+remPower);
			if (remPower > 15)
			{
				walk(weight, distance);
			}
			else
			{
				throw new PowerException("battery low");
			}

		}
		// return null;
	}

	@Override
	public void walk(Distance distance) throws PowerException
	{
		
		double remDistInMeters = distance.getDistance();
		
		while (meter < remDistInMeters)
		{
			meter += counter;
			
			System.out.println("My Robot is walking");

			System.out.println("My Robot walked for " + meter + " mtrs");
			
			remDistInMeters = (Double.parseDouble(currentStatus.get("distanceToTravel"))-meter);

			//System.out.println("remaining distance :" +  (Double.parseDouble(currentStatus.get("distanceToTravel"))-meter));
			System.out.println("remaining distance :" +  remDistInMeters);

			distance.setDistance(remDistInMeters);
			remPower = PowerUtil.calculateRemainingPower(weight.getWeight(), meter);
			System.out.println("remaining power : "+remPower);
			if (remPower > 15)
			{
				
				walk(distance);
			}
			else
			{
				
				throw new PowerException("battery low");
			}
			
			

		}
		// return null;
	}

}
