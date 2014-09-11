package com.sapient.cab.tests;

import java.util.List;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.sapient.cab.dao.CabServiceDaoImpl;
import com.sapient.cab.dao.ICabServiceDao;
import com.sapient.cab.entity.Cab;
import com.sapient.cab.entity.CabRequest;
import com.sapient.cab.exceptions.NoCabAvailableException;
import com.sapient.cab.service.CabBookingServiceImpl;

public class CabBookingServiceTest {

	
	@Test(expected = NoCabAvailableException.class)
	public void testGetAvailableCabs()
	{
		List<Cab> availCabs = null;
		List<CabRequest> reqs = null;
		ICabServiceDao dao = new CabServiceDaoImpl();
		CabBookingServiceImpl service = new CabBookingServiceImpl();
		reqs = dao.getCabBookingRequests();
		service.getAvailableCabs(reqs);
		
	}
}
