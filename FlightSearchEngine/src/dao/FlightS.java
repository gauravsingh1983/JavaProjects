package dao;

import java.util.Date;

public class FlightS {

	private String FLIGHT_NUM;
	private String DEP_LOC;
	private String ARR_LOC;
	private String VALID_TILL;
	private String FLIGHT_TIME;
	private String FLIGHT_DURN;
	private String FARE;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightS [FLIGHT_NUM=" + FLIGHT_NUM + ", DEP_LOC=" + DEP_LOC
				+ ", ARR_LOC=" + ARR_LOC + ", VALID_TILL=" + VALID_TILL
				+ ", FLIGHT_TIME=" + FLIGHT_TIME + ", FLIGHT_DURN="
				+ FLIGHT_DURN + ", FARE=" + FARE + "]";
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
	public String getVALID_TILL() {
		return VALID_TILL;
	}
	/**
	 * @param vALID_TILL the vALID_TILL to set
	 */
	public void setVALID_TILL(String vALID_TILL) {
		VALID_TILL = vALID_TILL;
	}
	/**
	 * @return the fLIGHT_TIME
	 */
	public String getFLIGHT_TIME() {
		return FLIGHT_TIME;
	}
	/**
	 * @param fLIGHT_TIME the fLIGHT_TIME to set
	 */
	public void setFLIGHT_TIME(String fLIGHT_TIME) {
		FLIGHT_TIME = fLIGHT_TIME;
	}
	/**
	 * @return the fLIGHT_DURN
	 */
	public String getFLIGHT_DURN() {
		return FLIGHT_DURN;
	}
	/**
	 * @param fLIGHT_DURN the fLIGHT_DURN to set
	 */
	public void setFLIGHT_DURN(String fLIGHT_DURN) {
		FLIGHT_DURN = fLIGHT_DURN;
	}
	/**
	 * @return the fARE
	 */
	public String getFARE() {
		return FARE;
	}
	/**
	 * @param fARE the fARE to set
	 */
	public void setFARE(String fARE) {
		FARE = fARE;
	}
	
	
	
}
