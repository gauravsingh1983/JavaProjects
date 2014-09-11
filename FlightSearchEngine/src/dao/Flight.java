package dao;

import java.util.Date;
import util.FlightDurnComparator;
import util.FlightFareComparator;

public class Flight implements Comparable<Flight>{

	private String FLIGHT_NUM;
	private String DEP_LOC;
	private String ARR_LOC;
	private Date VALID_TILL;
	private Date FLIGHT_TIME;
	private Date FLIGHT_DURN;
	private Double FARE;
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight [FLIGHT_NUM=" + FLIGHT_NUM + ", DEP_LOC=" + DEP_LOC
				+ ", ARR_LOC=" + ARR_LOC + ", VALID_TILL=" + VALID_TILL
				+ ", FLIGHT_TIME=" + FLIGHT_TIME + ", FLIGHT_DURN="
				+ FLIGHT_DURN + ", FARE=" + FARE + "]";
	}
	

	public Flight()
	{
		
	}
	
	public Flight(String fLIGHT_NUM, String dEP_LOC, String aRR_LOC,
			Date vALID_TILL, Date fLIGHT_TIME, Date fLIGHT_DURN, Double fARE) {
		super();
		FLIGHT_NUM = fLIGHT_NUM;
		DEP_LOC = dEP_LOC;
		ARR_LOC = aRR_LOC;
		VALID_TILL = vALID_TILL;
		FLIGHT_TIME = fLIGHT_TIME;
		FLIGHT_DURN = fLIGHT_DURN;
		FARE = fARE;
	}




	/**
	 * @return the fLIGHT_NUM
	 */
	public String getFLIGHT_NUM() {
		return FLIGHT_NUM;
	}
	/**
	 * @param fLIGHT_NUM the fLIGHT_NUM to set
	 */
	public void setFLIGHT_NUM(String fLIGHT_NUM) {
		FLIGHT_NUM = fLIGHT_NUM;
	}
	/**
	 * @return the dEP_LOC
	 */
	public String getDEP_LOC() {
		return DEP_LOC;
	}
	/**
	 * @param dEP_LOC the dEP_LOC to set
	 */
	public void setDEP_LOC(String dEP_LOC) {
		DEP_LOC = dEP_LOC;
	}
	/**
	 * @return the aRR_LOC
	 */
	public String getARR_LOC() {
		return ARR_LOC;
	}
	/**
	 * @param aRR_LOC the aRR_LOC to set
	 */
	public void setARR_LOC(String aRR_LOC) {
		ARR_LOC = aRR_LOC;
	}
	/**
	 * @return the vALID_TILL
	 */
	public Date getVALID_TILL() {
		return VALID_TILL;
	}
	/**
	 * @param vALID_TILL the vALID_TILL to set
	 */
	public void setVALID_TILL(Date vALID_TILL) {
		VALID_TILL = vALID_TILL;
	}
	/**
	 * @return the fLIGHT_TIME
	 */
	public Date getFLIGHT_TIME() {
		return FLIGHT_TIME;
	}
	/**
	 * @param fLIGHT_TIME the fLIGHT_TIME to set
	 */
	public void setFLIGHT_TIME(Date fLIGHT_TIME) {
		FLIGHT_TIME = fLIGHT_TIME;
	}
	/**
	 * @return the fLIGHT_DURN
	 */
	public Date getFLIGHT_DURN() {
		return FLIGHT_DURN;
	}
	/**
	 * @param fLIGHT_DURN the fLIGHT_DURN to set
	 */
	public void setFLIGHT_DURN(Date fLIGHT_DURN) {
		FLIGHT_DURN = fLIGHT_DURN;
	}
	/**
	 * @return the fARE
	 */
	public Double getFARE() {
		return FARE;
	}
	/**
	 * @param fARE the fARE to set
	 */
	public void setFARE(Double fARE) {
		FARE = fARE;
	}




	@Override
	public int compareTo(Flight f) {
		// TODO Auto-generated method stub
		return this.VALID_TILL.compareTo(f.VALID_TILL);
	}



	
}
