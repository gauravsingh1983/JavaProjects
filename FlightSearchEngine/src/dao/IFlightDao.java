package dao;

import java.util.List;

public interface IFlightDao {

	public List<Flight> getAllFlightData();
	
	public List<Flight> getAllFlightData(String filepath);
}
