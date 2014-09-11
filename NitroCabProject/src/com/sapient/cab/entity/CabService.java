package com.sapient.cab.entity;

public class CabService {
	
	private String serviceId;
	private Cab cab;
	
	private Traveller traveller;
	
	
	
	
	@Override
	public String toString() {
		return "CabService [serviceId=" + serviceId + ", cab=" + cab
				+ ", traveller=" + traveller + "]";
	}
	
	
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	

}
