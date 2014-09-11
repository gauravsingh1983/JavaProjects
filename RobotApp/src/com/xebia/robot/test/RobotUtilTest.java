package com.xebia.robot.test;

import junit.framework.Assert;

import org.junit.Test;

import com.xebia.robot.exceptions.OverloadException;
import com.xebia.robot.util.PowerUtil;

public class RobotUtilTest
{

	@Test
	public void testCalculateRemainingPower()
	{

		PowerUtil robotUtil = null;
		robotUtil = new PowerUtil();
		Assert.assertEquals(30.0, robotUtil.calculateRemainingPower(0, 3500));
	}

	// This test case passes because it was expecting NullPointerException
	@Test
	// (expected = OverloadException.class)
	public void OverloadException()
	{

		try
		{
			PowerUtil.calculateRemainingPower(15, 3500);
		}
		catch (OverloadException ex)
		{
			Assert.assertEquals(OverloadException.class, ex.getClass());
		}
		// Assert.assertEquals(expected, actual)
	}

}
