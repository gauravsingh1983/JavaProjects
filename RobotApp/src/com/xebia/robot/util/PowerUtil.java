package com.xebia.robot.util;

import com.xebia.robot.exceptions.OverloadException;
import com.xebia.robot.exceptions.PowerException;

public class PowerUtil
{

	public static double calculateRemainingPower(double weight, double distance) throws OverloadException
	{
		double remPower = 0;
		
		if (weight > 0)
		{
			remPower = remainingPower(weight, distance);
		}
		else
		{
			remPower = remainingPower(distance);
		}

		return remPower;
	}

	private static double remainingPower(double distanceTrvld)
	{
		double powerRemaining = 100;
		
		if (distanceTrvld > RobotConstants.MAX_DISTANCE)
		{
			throw new PowerException("NO POWER REMAINING TO WALK !! PLEASE CHARGE BATTERY");
		}
		else
		{
			powerRemaining = powerRemaining - getDischarge(distanceTrvld);
		}
		return powerRemaining;

	}

	private static double remainingPower(double weightCary, double distanceTrvld) throws OverloadException
	{
		double powerRemaining = 100;

		if (weightCary > RobotConstants.MAX_WEIGHT)
		{
			throw new OverloadException("OVERLOADED !! PLEASE REDUCE WEIGHT");
		}
		else
		{
			powerRemaining = powerRemaining - getDischargeByWeight(weightCary, distanceTrvld);
		}
		return powerRemaining;

	}

	private static double getDischarge(double distance)
	{
		return distance * (0.02);
	}

	private static double getDischargeByWeight(double weight, double distance)
	{
		return distance * ((1 + (0.2 * weight)) / 50);
	}

}
