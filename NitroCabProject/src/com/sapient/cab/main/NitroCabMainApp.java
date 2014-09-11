package com.sapient.cab.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sapient.cab.entity.CabRequest;
import com.sapient.cab.entity.CabService;
import com.sapient.cab.exceptions.NoCabAvailableException;
import com.sapient.cab.service.CabBookingServiceImpl;

public class NitroCabMainApp {


	public List<CabRequest> getCabBookingRequests() {
		
		List<CabRequest> cabRequestList = new ArrayList<CabRequest>();
		//cabRequestList.add(new CabRequest("BR001", new Long(100025), new Long(100036), getBookingTime(10)));
		//cabRequestList.add(new CabRequest("BR002", new Long(100056), new Long(100042), getBookingTime(11)));
		//cabRequestList.add(new CabRequest("BR003", new Long(100044), new Long(100056), getBookingTime(12)));
		cabRequestList.add(new CabRequest("BR004", new Long(100028), new Long(100036), getBookingTime(17)));
		return cabRequestList;
	}
	
	
	private Date getBookingTime(int timeInHr)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, timeInHr);
		cal.set(Calendar.MINUTE, 0);
		return cal.getTime();
	}
	
	public static void main(String[] args) {
		
		CabService srvc = null;
		try{
		NitroCabMainApp app = new NitroCabMainApp();
		List<CabRequest> cabRequestList = app.getCabBookingRequests();
		
		CabBookingServiceImpl service = new CabBookingServiceImpl();
		
		srvc = service.bookCabFromRequestBatch(cabRequestList);
		}
		catch (NoCabAvailableException e) {
			System.out.println("There are no cabs available at the moment!!!");
		}
		
		System.out.println(srvc);
	}
}
