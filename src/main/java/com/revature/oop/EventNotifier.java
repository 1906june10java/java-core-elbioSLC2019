package com.revature.oop;

import java.util.AbstractList;
import java.util.List;

public class EventNotifier {

	private List< listenerList = new ArrayList<>();
	
	public void addEventListener(EventListener listener) {
		listenerList.add(listener);
	}
	
	public void notifyEventListeners(EventListener listener) {
		for (EventListener listener : listenerList)
			if (listener.canHandle
	}
}
