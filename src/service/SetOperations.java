package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import model.TouristPlace;

public class SetOperations{
	HashSet<TouristPlace> hs=new HashSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places) {
		hs.add(places);
		return hs;
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places) {
		hs.remove(places);
		return hs;
	}
	
	public HashSet<TouristPlace>  sortByDestination(HashSet<TouristPlace> places) {
		ArrayList<TouristPlace> place=new ArrayList<TouristPlace>(places);
		Collections.sort(place,(p1,p2)-> p1.getDestination().compareTo(p2.getDestination()));
		return new HashSet<TouristPlace>(place);
	}
	
	public HashSet<TouristPlace>  sortByRank(HashSet<TouristPlace> places) {
		ArrayList<TouristPlace> place=new ArrayList<TouristPlace>(places);
		Collections.sort(place,(p1,p2)-> p1.getRank().compareTo(p2.getRank()));
		return new HashSet<TouristPlace>(place);
	}
	
	public HashSet<TouristPlace>  reset(HashSet<TouristPlace> places) {
		places.clear();
		return places;
	}
}