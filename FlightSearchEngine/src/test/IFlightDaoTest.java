package test;

import dao.FlightDaoImpl;
import dao.IFlightDao;
import junit.framework.TestCase;

public class IFlightDaoTest extends TestCase {

	public void testGetAllFlightData()
	{
		IFlightDao fdao = new FlightDaoImpl();
		assertNotNull(fdao.getAllFlightData());
	}
}
