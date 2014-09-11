package com.sapient.cab.entity;

import java.util.Calendar;
import java.util.Date;

public class CabRequest {
	
	private String bookingId;
	private Long pickupArea;
	private Long dropArea;
	private Date pickupTime;
	private Date bookingRequestTime;
	
	
	
	
	public CabRequest(String bookingId, Long pickupArea, Long dropArea,
			Date pickupTime) {
		super();
		this.bookingId = bookingId;
		this.pickupArea = pickupArea;
		this.dropArea = dropArea;
		this.pickupTime = pickupTime;
		this.setBookingRequestTime(Calendar.getInstance().getTime());
	}



	
	
	
	@Override
	public String toString() {
		return "CabRequest [bookingId=" + bookingId + ", pickupArea="
				+ pickupArea + ", dropArea=" + dropArea + ", pickupTime="
				+ pickupTime + ", bookingRequestTime=" + bookingRequestTime
				+ "]";
	}






	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Long getPickupArea() {
		return pickupArea;
	}
	public void setPickupArea(Long pickupArea) {
		this.pickupArea = pickupArea;
	}
	public Long getDropArea() {
		return dropArea;
	}
	public void setDropArea(Long dropArea) {
		this.dropArea = dropArea;
	}
	public Date getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(Date pickupTime) {
		this.pickupTime = pickupTime;
	}



	public Date getBookingRequestTime() {
		return bookingRequestTime;
	}



	public void setBookingRequestTime(Date bookingRequestTime) {
		this.bookingRequestTime = bookingRequestTime;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime
				* result
				+ ((bookingRequestTime == null) ? 0 : bookingRequestTime
						.hashCode());
		result = prime * result
				+ ((dropArea == null) ? 0 : dropArea.hashCode());
		result = prime * result
				+ ((pickupArea == null) ? 0 : pickupArea.hashCode());
		result = prime * result
				+ ((pickupTime == null) ? 0 : pickupTime.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CabRequest other = (CabRequest) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (bookingRequestTime == null) {
			if (other.bookingRequestTime != null)
				return false;
		} else if (!bookingRequestTime.equals(other.bookingRequestTime))
			return false;
		if (dropArea == null) {
			if (other.dropArea != null)
				return false;
		} else if (!dropArea.equals(other.dropArea))
			return false;
		if (pickupArea == null) {
			if (other.pickupArea != null)
				return false;
		} else if (!pickupArea.equals(other.pickupArea))
			return false;
		if (pickupTime == null) {
			if (other.pickupTime != null)
				return false;
		} else if (!pickupTime.equals(other.pickupTime))
			return false;
		return true;
	}
	
	
}
