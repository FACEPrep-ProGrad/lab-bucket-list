package service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations {
	static Map<String,TouristPlace> touristMap = new HashMap<String,TouristPlace>();
	public Map add(TouristPlace places) {
		touristMap.put(places.getName(), places);
		return touristMap;
	}
	public Map sortRandomly(TouristPlace places) {
		
		return add(places);
	}
	public Map sortInEntryOrder(Map<String, Object> mapobj) {
		return touristMap;
	}
	public Map sortAlphabetically(Map<String, Object> mapobj) {
		TreeMap<String,TouristPlace> sortedplaces=new TreeMap<String,TouristPlace>();
        return sortedplaces;
        

	}
	public Object reset(TouristPlace places) {
		touristMap.clear();
		return places;
	}
	public Map remove(TouristPlace places) {
		touristMap.remove(places.getName());
		return  touristMap;
	}
}
