package service;


import java.util.HashMap;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations {
	HashMap<String,TouristPlace> map=new HashMap<String,TouristPlace>();
	public HashMap<String,TouristPlace> add(TouristPlace places) {
		map.put(places.getName(), places);
		return map;
	}
	
	
	public HashMap<String,TouristPlace> sortRandomly(HashMap<String,TouristPlace> places) {
		return map;
	}
	
	
	public HashMap<String,TouristPlace> sortInEntryOrder(HashMap<String,TouristPlace> places) {
		return map;
	}
	
	
	public TreeMap<String,TouristPlace> sortAlphabetically(HashMap<String,TouristPlace> places) {
		TreeMap<String,TouristPlace> sort= new TreeMap<String,TouristPlace>(places);
		return sort;
	}
	
	public HashMap<String,TouristPlace> reset(HashMap<String,TouristPlace> places) {
		places.clear();
		return places;
	}
	
	public HashMap<String, TouristPlace> remove(TouristPlace places) {
		map.remove(places.getName());
		return map;
	}
}