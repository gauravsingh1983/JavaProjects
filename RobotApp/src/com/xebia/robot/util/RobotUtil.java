package com.xebia.robot.util;

import com.xebia.robot.exceptions.OverloadException;
import com.xebia.robot.exceptions.PowerException;

public abstract class RobotUtil {

	public abstract double calculateRemainingPower(double weight, double distance) throws OverloadException;
	
}