package service;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import model.TouristPlace;

public class MapOperations {
	static Map<String,TouristPlace> touristMap = new HashMap<String,TouristPlace>();
	public Map add(TouristPlace places) {
		touristMap.put(places.getName(), places);
		return touristMap;
	}
	public Map sortRandomly(TouristPlace places) {
		Map<String,TouristPlace> touristMap = new HashMap<String,TouristPlace>();
		 List<Entry<String, TouristPlace>> list = convertToList(touristMap);
		 Collections.shuffle(list);
		 Map<String,TouristPlace> touristMap1 = new HashMap<String,TouristPlace>();
		 for (Entry i : list) touristMap1.put(i.getKey(),i);
		 return touristMap1;
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
	
	 public static<K,V> List<Map.Entry<K,V>> convertToList(Map<K,V> map)
	    {
	        return map.entrySet()
	                .stream()
	                .collect(Collectors.toList());
	    }
}
