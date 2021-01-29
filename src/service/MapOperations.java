package service;

import java.util.*;

import model.TouristPlace;

public class MapOperations{
	Map<String,TouristPlace> map = new HashMap<String,TouristPlace>();
	
	public Map add(TouristPlace places) {
		map.put(places.getName(), places);
		return map;
		
	}
	public Map sortRandomly(TouristPlace places) {
		
		return (Map)places;
		
	}
	public Map sortInEntryOrder(HashMap places) {
		map = new HashMap<String,TouristPlace>();
		return places;
		
	}
	public Map sortAlphabetically(HashMap places) {
		map = new TreeMap<String,TouristPlace>();
		return map;
	}
	public Map reset(HashMap places) {
		places.clear();
		return places;
		
	}
	public Map remove(TouristPlace places) {
		map.remove(places.getName());
		return map;
		
	}
	
	
}