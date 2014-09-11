package com.sapient.cab.entity;

public class Cab implements Comparable<Cab>{

	private String cabNo;
	private Long initialLoc;
	private boolean isBooked =false;
	
	private Double distToTravel;
	private Double timeTaken;
	private Double profit;

	
	public Cab(String cabNo, Long initialLoc) {
		super();
		this.cabNo = cabNo;
		this.initialLoc = initialLoc;
	}



	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", initialLoc=" + initialLoc + "]";
	}
	
	
	


	public Double getDistToTravel() {
		return distToTravel;
	}



	public void setDistToTravel(Double distToTravel) {
		this.distToTravel = distToTravel;
	}



	public Double getTimeTaken() {
		return timeTaken;
	}



	public void setTimeTaken(Double timeTaken) {
		this.timeTaken = timeTaken;
	}



	public Double getProfit() {
		return profit;
	}



	public void setProfit(Double profit) {
		this.profit = profit;
	}



	public String getCabNo() {
		return cabNo;
	}
	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}
	public long getInitialLoc() {
		return initialLoc;
	}
	public void setInitialLoc(Long initialLoc) {
		this.initialLoc = initialLoc;
	}



	public boolean isBooked() {
		return isBooked;
	}



	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}



	@Override
	public int compareTo(Cab o) {
		// TODO Auto-generated method stub
		return this.compareTo(o);
	}
	
	
}
