package service;
import java.util.*;

import model.TouristPlace;
public class SetOperations{
	ArrayList<TouristPlace> list = new ArrayList<TouristPlace>();
	HashSet<TouristPlace> set = new HashSet<TouristPlace>();
	public  HashSet add(TouristPlace places) {
		set.add(places);
		return set;
		
	}
	public HashSet remove(TouristPlace places) {
		set.remove(places);
		
		return set;
		
	}
	public Object sortByDestination(TouristPlace places) {
		list.sort((TouristPlace p1,TouristPlace p2)->p1.getDestination().compareTo(p2.getDestination()));
		return list;
		
	}
	public Object sortByRank(TouristPlace places) {
		
		list.sort((TouristPlace p1,TouristPlace p2)->p1.getRank().compareTo(p2.getRank()));

		return list;
		
	}
	public Object reset(HashSet places) {
		set.clear();
		return set;
		
	}
	
	
	
}