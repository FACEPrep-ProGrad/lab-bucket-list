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
		
		return add(places);
		
	}
	public Map sortInEntryOrder(HashMap places) {
		return places;
		
	}
	public Map sortAlphabetically(HashMap places) {
		TreeMap<String,TouristPlace> sortedplaces=new TreeMap<String,TouristPlace>(places);
        return sortedplaces;
		
	}
	public Object reset(HashMap places) {
		
		places.clear();
		return places;
		
	}
	public Map remove(TouristPlace places) {
		
		map.remove(places.getName());
		return  map;
		
	}
}