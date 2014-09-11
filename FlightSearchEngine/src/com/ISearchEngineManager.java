package com;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import dao.Flight;

public interface ISearchEngineManager {

	public List<Flight> searchFlight(String dep_loc, String arr_loc, Date flight_date);
	
	public List<Flight> searchFlightByFare(String dep_loc, String arr_loc, Date flight_date, Comparator<Flight> flight_fare);
	
	public List<Flight> searchFlightbyDuration(String dep_loc, String arr_loc, Date flight_date, Comparator<Flight> flight_durn);

	public List<Flight> searchAndSortFlight(String dep_loc, String arr_loc,Date flight_date, String output_pref);

}
