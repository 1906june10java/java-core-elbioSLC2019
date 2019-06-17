package com.revature.collections;


// Comparator also provides a means of sorting
// exposes 1 method: compare
// In order to be sorted by a Comparator, the sorted class DOES NOT need to implement
// this interface
public class DigimonComparator implements Comparator<Digimon> {
	
	// What's up with these int return types?
	// 0 => they are efectively the same (by .equals())\
	// positive => arg0 should be sorted first
	// negative => arg1 should be sorted first
	@Override
	public int compare(Digimon arg0, Digimon arg1) 
	{
		// Sort by name ascendingly
		return arg0.getName().compareTo(arg1.getName());
	}

}
