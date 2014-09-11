package com.sapient.cab.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import com.sapient.cab.dao.CabServiceDaoImpl;
import com.sapient.cab.dao.ICabServiceDao;
import com.sapient.cab.entity.Cab;
import com.sapient.cab.entity.CabRequest;
import com.sapient.cab.entity.CabService;
import com.sapient.cab.exceptions.NoCabAvailableException;
import com.sapient.cab.util.CabProfitComparator;
import com.sapient.cab.util.Calculator;

public class CabBookingServiceImpl implements ICabBookingService
{

	ICabServiceDao	dao	= new CabServiceDaoImpl();

	@Override
	public CabService bookCabFromRequestBatch(List<CabRequest> requestList)
	{

		Map<CabRequest, List<Cab>> availCabReqMap = getAvailableCabs(requestList);
		List<Cab> availCabs = null;
		CabService service = null;
		for (CabRequest req : requestList)

			availCabs = availCabReqMap.get(req);

		if (availCabs.size() > 0)
		{
			Collections.sort(availCabs, new CabProfitComparator());

			UUID serviceId = UUID.randomUUID();

			service = new CabService();
			service.setCab(availCabs.get(0));
			service.setServiceId(serviceId.toString());

		}
		else
		{
			throw new NoCabAvailableException();
		}
		return service;
	}

	public Map<CabRequest, List<Cab>> getAvailableCabs(List<CabRequest> requestList) throws NoCabAvailableException
	{
		Map<CabRequest, List<Cab>> map = new HashMap<CabRequest, List<Cab>>();
		List<Cab> cabs = dao.getAllCabs();
		List<Cab> availCabs = new ArrayList<Cab>();

		double distance;
		double timetotravel;
		double timediff;
		
		for (CabRequest req : requestList)
		{
			for (Cab cab : cabs)
			{
				distance = Calculator.getDistance(cab.getInitialLoc(), req.getPickupArea(), req.getDropArea());
				timetotravel = Calculator.getTimeToTravel(distance);
				timediff = Calculator.getTimeDiff(req.getPickupTime(), req.getBookingRequestTime());

				if ((timediff - timetotravel) > 0 && Calculator.getProfit(distance) >= 20)
				{
					cab.setProfit(Calculator.getProfit(distance));
					availCabs.add(cab);
				}

			}

			if (availCabs.size() == 0)
			{
				throw new NoCabAvailableException();
			}

			map.put(req, availCabs);
		}
		return map;
	}

	@Override
	public boolean isCabReachableOnTime(CabRequest req)
	{

		return false;
	}

	@Override
	public boolean isCabProfitable(CabRequest req)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidBookingTime(CabRequest req)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
