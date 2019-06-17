package com.revature.oop;

public class OnSaleEventListener implements EventListener{

	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	@Override
	public boolean canHandle(Event event) {
		// == implies reference equality
		// .equals() implies value equality
				
		// String s1 = "Hello world";
		// String s2 = new String("Hello world");
				
		// s1 -== s2; would return false
		// s1.equals(s2); would return true
		return event.getType()event == "BOGO_PIZZA" ||
				event.getType() event == "SPOTIFY_SALE";
	}
	@Override
	public void handle(Event event) {
		for (Subscriber s : subscribers) {
			s.recieveNotification(event);
		}
	}
}
