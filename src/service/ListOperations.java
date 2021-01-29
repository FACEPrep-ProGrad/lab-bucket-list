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
	public  Object sortByDestination(List places) {
		Collections.sort(list,(TouristPlace t1,TouristPlace t2) -> t1.getDestination().compareTo(t2.getDestination()));

		return list;
		
	}
	public List sortByRank(List places) {
		
		Collections.sort(list,(TouristPlace t1,TouristPlace t2) -> t1.getDestination().compareTo(t2.getDestination()));
		
		
		return list;
	}
	public Object reset(List places) {
		places.clear();
		return places;
		
	}
	
}



