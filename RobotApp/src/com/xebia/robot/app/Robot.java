package com.xebia.robot.app;
import com.xebia.robot.exceptions.OverloadException;
import com.xebia.robot.exceptions.PowerException;
import com.xebia.robot.util.*;
public interface Robot {

	String walk() throws PowerException;
	void walk(Distance distance) throws PowerException;
	void walk(Weight weight) throws OverloadException;
	void walk(Weight weight,Distance dist) throws PowerException,OverloadException;
	
}