package service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	
	List<TouristPlace> list=new LinkedList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) {
		list.add(places);
		return list;
	}
	
	public List<TouristPlace> remove() {
		list.remove(list.size()-1);
		for(TouristPlace x:list)
			System.out.println(x.getName());
		return list;
	}
	
	public List<TouristPlace> sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(p1,p2)-> p1.getDestination().compareTo(p2.getDestination()));
		return places;
		
	}
	public List<TouristPlace> sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(p1,p2)->p1.getRank().compareTo(p2.getRank()));
		return places;
	}
	public List<TouristPlace> reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}