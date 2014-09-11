package util;

import java.util.Comparator;

import dao.Flight;

public class FlightDurnComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		// TODO Auto-generated method stub
		return f1.getFLIGHT_DURN().compareTo(f2.getFLIGHT_DURN());
	}

}
