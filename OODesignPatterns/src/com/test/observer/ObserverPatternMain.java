package com.test.observer;

public class ObserverPatternMain
{
	public static void main(String[] args)
	{
		Person hughPerson = new Person("Hugh");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

		// When you opt for option "Notify me when product is available".Below
		// registerObserver method
		// get executed
		samsungMobile.registerObserver(hughPerson);
		samsungMobile.registerObserver(johnPerson);

		// Now product is available
		samsungMobile.setAvailability("Available");

	}
}