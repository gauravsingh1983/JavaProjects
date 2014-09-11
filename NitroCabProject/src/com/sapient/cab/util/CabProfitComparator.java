package com.sapient.cab.util;

import java.util.Comparator;

import com.sapient.cab.entity.Cab;

public class CabProfitComparator implements Comparator<Cab>{

	@Override
	public int compare(Cab o1, Cab o2) {

		int result;
		
		result = o1.getProfit().compareTo(o2.getProfit());
		
		return result;
	}

}
