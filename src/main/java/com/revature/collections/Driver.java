package com.revature.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
	
	public static void main(String[] args) {
		
		Digimon d1 = new Digimon("Balbasar","Grass");
		Digimon d2 = new Digimon("Squartile","Water");
		Digimon d3 = new Digimon("Charmander","Fire");
		
		Set<Digimon> myDigimon = new TreeSet<>(new DigimonComparator());
		myDigimon.add(d1);
		myDigimon.add(d2);
		myDigimon.add(d3);
				
		pokemon p1 = new pokemon("Balbasar","Grass");
		pokemon p2 = new pokemon("Squartile","Water");
		pokemon p3 = new pokemon("Charmander","Fire");
		pokemon p4 = new pokemon("Charmander","Fire");
		
		// TreeSets will throw a ClassCastException if the objectfor (pok that add to it
		// does not have a means of sorting
		Set<pokemon> myPokemon = new TreeSet<>();
		myPokemon.add(p1);
		myPokemon.add(p2);
		myPokemon.add(p3);
		
		System.out.println("The number of pokemon in our set" + myPokemon.size());
		
		// Enhanced for-loop requires an Iterable<T> on the right, and T on the left
		
		for (pokemon p : myPokemon) {
			System.out.println(p);
		}
		
	}
}
