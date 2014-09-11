package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import util.FlightDurnComparator;
import util.FlightFareComparator;

import dao.Flight;
import dao.FlightDaoImpl;
import dao.IFlightDao;

public class SearchEngineManagerImpl implements ISearchEngineManager
{

	List<Flight>	resultFlights;

	@Override
	public List<Flight> searchAndSortFlight(String dep_loc, String arr_loc, Date flight_date, String output_pref)
	{
		// TODO Auto-generated method stub
		if ("F".equals(output_pref))
		{

			resultFlights = searchFlightByFare(dep_loc, arr_loc, flight_date, new FlightFareComparator());
		}

		else if ("FF".equals(output_pref))
		{

			resultFlights = searchFlightbyDuration(dep_loc, arr_loc, flight_date, new FlightDurnComparator());
		}

		return resultFlights;
	}

	@Override
	public List<Flight> searchFlightByFare(String dep_loc, String arr_loc, Date flight_date, Comparator<Flight> flight_fare)
	{

		List<Flight> resultFlights = searchFlight(dep_loc, arr_loc, flight_date);

		Collections.sort(resultFlights, flight_fare);

		return resultFlights;
	}

	@Override
	public List<Flight> searchFlightbyDuration(String dep_loc, String arr_loc, Date flight_date, Comparator<Flight> flight_durn)
	{

		List<Flight> resultFlights = searchFlight(dep_loc, arr_loc, flight_date);

		Collections.sort(resultFlights, flight_durn);

		return resultFlights;
	}

	@Override
	public List<Flight> searchFlight(String dep_loc, String arr_loc, Date flight_date)
	{

		IFlightDao fdao = new FlightDaoImpl();
		List<Flight> allFlights = fdao.getAllFlightData();

		List<Flight> resultFlights = new ArrayList<Flight>();

		for (Flight f : allFlights)
		{
			if (f.getDEP_LOC().equals(dep_loc) && f.getARR_LOC().equals(arr_loc) && f.getVALID_TILL().equals(flight_date))
			{
				resultFlights.add(f);
			}
		}

		// TODO Auto-generated method stub
		return resultFlights;
	}

}
