package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.ReadCSVFile;

public class FlightDaoImpl implements IFlightDao {

	@Override
	public List<Flight> getAllFlightData(String filepath) {
		// TODO Auto-generated method stub
		List<Flight> flightList  = new ArrayList<Flight>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date validtill = null;
		Date ftime = null;
		Date fdurn = null;
		Double fare = 480.0;
		try {
			validtill  = sdf.parse("20-11-2010");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Flight f1 = new Flight("AF299", "FRA", "LHR", validtill, ftime, fdurn, fare);
		Flight f2 = new Flight("AF118", "DUB", "MUC", validtill, ftime, fdurn, fare);
		Flight f3 = new Flight("AF371", "AMS", "MAD", validtill, ftime, fdurn, fare);
		flightList.add(f1);
		flightList.add(f2);
		flightList.add(f3);
		return flightList;
	}

	@Override
	public List<Flight> getAllFlightData()
	{
		List<Flight> flightList  = null;
		ReadCSVFile rcv = new ReadCSVFile();
		flightList = rcv.readFile();
		return flightList;
	}

}
