package com.test.observer;

import com.test.observer.Observer;

public interface Subject
{
	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
