package com.xebia.robot.main;

import com.xebia.robot.app.MyRobot;
import com.xebia.robot.app.Robot;
import com.xebia.robot.app.RobotFactory;
import com.xebia.robot.exceptions.PowerException;
import com.xebia.robot.util.Distance;
import com.xebia.robot.util.Power;
import com.xebia.robot.util.Weight;

public class RobotMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotFactory factory = new  RobotFactory();
		Robot robot = (MyRobot) factory.getRobot("MY_ROBOT");
		MyRobot myRobot;
		if(robot instanceof MyRobot)
		{
			myRobot = (MyRobot)robot;
			myRobot.setDistance(new Distance(3500));
			myRobot.setPower(new Power(100));
			myRobot.setWeight(new Weight(0));
			try{
			myRobot.walk();
			}
			catch(PowerException ex)
			{
				System.out.println("low battery");
				return;
			}
		}
		//myRobot.
	}

}
