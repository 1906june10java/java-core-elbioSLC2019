package com.revature.oop;

public class SpotifyOnSaleEvent implements Event {
	@Override
	public String getType() {
		return "SPOTIFY_SALE";
	}
}
