package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FlightUtil
{

	/**
	 * @param validTill
	 * @return
	 * @throws ParseException 
	 */
	public static Date flightValidTillToDate(String validTill) throws ParseException
	{
		//validTill = "20-10-2010";
		Date VALID_TILL = new SimpleDateFormat("dd-mm-yyyy").parse(validTill);
		return VALID_TILL;
	}
	/**
	 * @param time
	 * @return
	 */
	public static Date flightDurationToDate(String durn)
	{
		Date FLIGHT_DURN = null;
		
		String[] timeVal = durn.split("\\.");
		
		Calendar fdurn = Calendar.getInstance();
		
		FLIGHT_DURN = calendarToDate(fdurn, timeVal);
		
		return FLIGHT_DURN;
	}

	
	/**
	 * @param time
	 * @return
	 */
	public static Date flightTimeToDate(String time)
	{
		Date FLIGHT_TIME = null;
		//time = "0630";
		
		String[] timeVal = new String[2];
		timeVal[0] = time.substring(0, 2);
		timeVal[1] = time.substring(2, time.length());
		
		Calendar ftime = Calendar.getInstance();

		FLIGHT_TIME = calendarToDate(ftime, timeVal);
		
		return FLIGHT_TIME;
	}
	
	
	/**
	 * @param cal
	 * @param timeVal
	 * @return
	 */
	public static Date calendarToDate(Calendar cal, String[] timeVal)
	{
		cal.set(Calendar.HOUR, Integer.parseInt(timeVal[0]));
		cal.set(Calendar.MINUTE, Integer.parseInt(timeVal[1]));
		return cal.getTime();
	}
}
