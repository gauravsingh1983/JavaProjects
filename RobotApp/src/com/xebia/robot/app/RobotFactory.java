package com.xebia.robot.app;

import com.xebia.robot.util.RobotConstants;

public class RobotFactory {

		
		   //use getShape method to get object of type shape 
		   public Robot getRobot(String robotType){
		      if(robotType == null){
		         return null;
		      }		
		      if(robotType.equalsIgnoreCase(RobotConstants.MY_ROBOT)){
		         return new MyRobot();
		      } else if(robotType.equalsIgnoreCase(RobotConstants.GENERIC_ROBOT)){
		         return new GenericRobot();
		      } else if(robotType.equalsIgnoreCase(RobotConstants.SIMPLE_ROBOT)){
		         return new SimpleRobot();
		      }
		      return null;
		   }
}
