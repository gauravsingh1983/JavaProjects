/**
 * 
 */
package com.xebia.robot.exceptions;

/**
 * Exception class for scenario where Robot's power is drained to 15 percent of
 * the battery.
 * 
 */
public class PowerException extends RuntimeException {

	/**
	 * serialVersionUID for this serializable class.
	 */
	private static final long serialVersionUID = 6053095209096387566L;

	/**
	 * 
	 */
	public PowerException() {
	}


	/**
	 * @param message
	 * @param cause
	 */
	public PowerException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PowerException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PowerException(Throwable cause) {
		super(cause);
	}

}
