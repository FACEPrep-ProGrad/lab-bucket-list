package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import model.TouristPlace;


public class SetOperations{
	
	HashSet<TouristPlace> bucketList = new HashSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places){
		
		bucketList.add(places);
		return bucketList;
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places){
		System.out.println("Remove this id:");
		System.out.println(places);
		bucketList.remove(places);
		return bucketList;
	}
	
	public Object sortByDestination(HashSet<TouristPlace> places) {
		
		ArrayList<TouristPlace> bucketList = new ArrayList<TouristPlace>(places);
		
		bucketList.sort((TouristPlace p1, TouristPlace p2) -> p1.getDestination().compareTo(p2.getDestination()) );
		
		return new LinkedHashSet<TouristPlace>(bucketList);
	}
	
	public Object sortByRank(HashSet<TouristPlace> places) {
		
		ArrayList<TouristPlace> bucketList = new ArrayList<TouristPlace>(places);
		
		bucketList.sort((TouristPlace p1, TouristPlace p2) -> p1.getRank().compareTo(p2.getRank()));
		
		return new LinkedHashSet<TouristPlace>(bucketList);	
	}
	
	public Object reset(HashSet<TouristPlace> places) {
		
		places.clear();
		
		return places;
	}
}
