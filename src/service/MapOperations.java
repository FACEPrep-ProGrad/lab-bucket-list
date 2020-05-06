package service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import model.TouristPlace;

public class MapOperations{
	public Map<Integer,TouristPlace> add(TouristPlace places){
		Map<Integer,TouristPlace> addPlaces=new HashMap<>();
		addPlaces.put( null, places);
		return addPlaces;
	}
	public Map<Integer,TouristPlace> sortRandomly(TouristPlace places){
		Map<Integer,TouristPlace> sortRandomlyPlaces=new HashMap<>();
		sortRandomlyPlaces.put( null, places);
		return sortRandomlyPlaces;	
	}
	public Map<Integer,TouristPlace> sortInEntryOrder(TouristPlace places){
		Map<Integer,TouristPlace> sortInEntryOrderPlaces=new LinkedHashMap<>();
		 sortInEntryOrderPlaces.put( null, places);
		return  sortInEntryOrderPlaces;
		
		
	}
	public Map<Integer,TouristPlace> sortAlphabetically(TouristPlace places){
		Map<Integer,TouristPlace> sortAlphabeticallyPlaces=new TreeMap<>();
		 sortAlphabeticallyPlaces.put( null, places);
		return  sortAlphabeticallyPlaces;
		
	}
	public Object reset(HashMap<Integer,TouristPlace> places) {
		Map<Integer,TouristPlace> resetPlaces=new TreeMap<>();
		resetPlaces.clear();
		return resetPlaces;
		
	}
	public Map<Integer, TouristPlace> remove(TouristPlace places){
		Map<Integer,TouristPlace> removePlace=new HashMap<>();
		removePlace.remove( null, places);
		return removePlace;
		
	}

}