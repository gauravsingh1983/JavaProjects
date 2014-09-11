package com.sapient.cab.dao;

import java.util.List;

import com.sapient.cab.entity.Cab;
import com.sapient.cab.entity.CabRequest;

public interface ICabServiceDao {

	public List<Cab> getAllCabs();
	
	public List<CabRequest> getCabBookingRequests();
	
}
