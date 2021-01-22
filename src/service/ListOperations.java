package service;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	 static List<Object> list = new ArrayList<Object>();
	
	public List add(TouristPlace places) {
		
		list.add(places);
		return list;		
	}
	
	
	public List remove() {
		int lastIndex=list.size()-1;
		list.remove(lastIndex);
		return list;
		
	}
	public List sortByDestination(List places)
	{
		Collections.sort(places ,(TouristPlace place1,TouristPlace place2)-> (place1.getDestination()).compareTo(place2.getDestination()));
		return places;
		
	}
	public List sortByRank(List places) {
		Collections.sort(places ,(TouristPlace place1,TouristPlace place2)-> (place1.getRank()).compareTo(place2.getRank()));

		return places;
	}
	public List reset(List places) {
		
		places.clear();
		return places;
	}
	
	  }
