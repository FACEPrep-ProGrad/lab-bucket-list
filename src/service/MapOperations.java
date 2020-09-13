package service;

import java.util.HashMap;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations{
	
	
	HashMap<String,TouristPlace> map = new HashMap<String,TouristPlace>();
	
	public HashMap<String,TouristPlace> add(TouristPlace places){
		
		map.put(places.getName(), places);
		return map;
	}
	
	public HashMap<String,TouristPlace> sortRandomly(TouristPlace places) {
		return add(places);
	}
	
	public HashMap<String,TouristPlace> sortInEntryOrder(HashMap<String,TouristPlace> places) {
		
		return null;
	}
	
	public TreeMap<String,TouristPlace>  sortAlphabetically(HashMap<String,TouristPlace> places) {
		
		TreeMap<String, TouristPlace>  SortedPlaces = new TreeMap<String,TouristPlace>(places);
		return SortedPlaces;
	}
	
	public Object reset(HashMap<String,TouristPlace> places) {
		places.clear();
		return places;
	}
	
	public HashMap<String,TouristPlace> remove(TouristPlace places) {
		
		map.remove(places.getName());
		return null;
	}
}
