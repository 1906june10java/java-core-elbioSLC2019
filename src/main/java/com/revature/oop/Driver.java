package com.revature.oop;

public class Driver {

		public static void main(String[] args) {
			EventListener listener = new OnSaleEventListener();
			listener.addSubscriber(new Subscriber("William"));
			listener.addSubscriber(new Subscriber("quinn"));
			listener.addSubscriber(new Subscriber("avery"));
			
			EventNotifier notifier = new EventNotifier();
			notifier.addEventListener(listener);
			
			notifier.notififyEventListeners(new DominosSaleEvent();
			try {
				Thread.sleep(1000L);
			} catch{
				System.err.println("SOMETHING WENT WRONG");
			}
			
			
			
			
			notifier.notifyEventListeners(new SpotifyOnSaleEvent());
			notifier.notifyEventListeners(new FriendRequestEvent());
}
