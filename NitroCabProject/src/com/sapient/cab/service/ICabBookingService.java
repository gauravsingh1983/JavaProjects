package com.sapient.cab.service;

import java.util.List;

import com.sapient.cab.entity.CabRequest;
import com.sapient.cab.entity.CabService;

public interface ICabBookingService {


	CabService bookCabFromRequestBatch(List<CabRequest> requestList);
	
	boolean isCabReachableOnTime(CabRequest req);
	
	boolean isCabProfitable(CabRequest req);
	
	boolean isValidBookingTime(CabRequest req);
	
}
