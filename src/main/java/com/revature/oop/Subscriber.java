package com.revature.oop;

public class Subscriber {
	
	private String username;
	
	public Subscriber(String username) {
		this.username = username;
	}

	public void receiveNotification(Event event) {
		System.out.println(username + " received notification of " + event.getType());
	}
}
