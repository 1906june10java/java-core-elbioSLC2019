package com.revature.oop;

public interface EventListener {
	
	abstract boolean canHandle(Event event);
	
	// Full signature is optional; public abstract is implied
	public void handle(Event event);
	
	void addSubscriber(Subscriber subscriber);
	
}
