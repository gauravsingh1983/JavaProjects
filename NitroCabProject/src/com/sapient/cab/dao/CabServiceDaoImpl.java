package com.sapient.cab.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sapient.cab.entity.Cab;
import com.sapient.cab.entity.CabRequest;

public class CabServiceDaoImpl implements ICabServiceDao{

	@Override
	public List<Cab> getAllCabs() {

		List<Cab> cabList = new ArrayList<Cab>();
		cabList.add(new Cab("DL01HB001",new Long(100020)));
		cabList.add(new Cab("DL01HB002",new Long(100040)));
		cabList.add(new Cab("DL01HB003",new Long(100060)));
		cabList.add(new Cab("DL01HB004",new Long(100080)));
		return cabList;
		
	}

	@Override
	public List<CabRequest> getCabBookingRequests() {
		
		List<CabRequest> cabRequestList = new ArrayList<CabRequest>();
		cabRequestList.add(new CabRequest("BR001", new Long(100025), new Long(100036), getBookingTime(10)));
		cabRequestList.add(new CabRequest("BR002", new Long(100056), new Long(100042), getBookingTime(11)));
		cabRequestList.add(new CabRequest("BR003", new Long(100044), new Long(100056), getBookingTime(12)));
		cabRequestList.add(new CabRequest("BR004", new Long(100028), new Long(100036), getBookingTime(15)));
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
		ICabServiceDao dao = new CabServiceDaoImpl();
		System.out.println(dao.getCabBookingRequests());
	}
}
