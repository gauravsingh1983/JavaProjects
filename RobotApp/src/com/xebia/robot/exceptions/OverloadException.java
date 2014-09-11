/**
 * 
 */
package com.xebia.robot.exceptions;

/**
 * Exception class for scenario where Robot is being loaded with over weight.
 * 
 */
public class OverloadException extends RuntimeException {

	/**
	 * serialVersionUID for this serializable class.
	 */
	private static final long serialVersionUID = 6053095209096387566L;

	/**
	 * 
	 */
	public OverloadException() {
	}

	/**
	 * @param message
	 * @param cause
	 */
	public OverloadException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public OverloadException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public OverloadException(Throwable cause) {
		super(cause);
	}

}
