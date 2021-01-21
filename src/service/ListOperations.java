package service;

import java.util.*;

import model.TouristPlace;

public class ListOperations{
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	
	public List add(TouristPlace places) {
		list.add(places);
		
		return list;
		
	}
	public List remove(TouristPlace places) {
		list.remove(places);
		return list;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getDestination().compareTo(place2.getDestination()));
		return places;
	}
	public Object sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getDestination().compareTo(place2.getDestination()));
		return places;
	}
	public Object reset(List places) {
		Collections.sort(places,Comparator.naturalOrder());
		return places;
	}
}