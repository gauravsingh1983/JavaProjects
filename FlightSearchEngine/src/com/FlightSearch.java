package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.Flight;

public class FlightSearch {

	public static void main(String[] args) {
		
		////////
		String dep_loc = "FRA";
		String arr_loc = "LHR";
		Date flight_date = null;
		try
		{
			flight_date = new SimpleDateFormat("dd-mm-yyyy").parse("20-11-2010");
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String output_pref = "FF";
		
		SearchEngineManagerImpl engine = new SearchEngineManagerImpl();
		
		List<Flight> resultFlights = engine.searchAndSortFlight(dep_loc, arr_loc, flight_date, output_pref);

		System.out.println(resultFlights);
		
	}
}
