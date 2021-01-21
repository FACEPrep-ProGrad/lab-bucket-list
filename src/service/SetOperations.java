package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import model.TouristPlace;

public class SetOperations{
	
	
	HashSet<TouristPlace> bucketlist=new HashSet<TouristPlace>();
	
	
	public HashSet<TouristPlace> add(TouristPlace places){
		bucketlist.add(places);
		return bucketlist;
	}
	
	
	public HashSet <TouristPlace>remove(TouristPlace places){
		bucketlist.remove(places);
		return bucketlist;
	}
	
	
	public Object sortByDestination(HashSet<TouristPlace> places) {
		
		ArrayList <TouristPlace> bucketlist=new ArrayList<TouristPlace>();
		
		bucketlist.sort((TouristPlace p1,TouristPlace p2)->p1.getDestination().compareTo(p2.getDestination()));
		
		return new LinkedHashSet<TouristPlace>(bucketlist);
		
		}

	
	public Object sortByRank(HashSet <TouristPlace>places) {
		
		ArrayList<TouristPlace> bucketlist=new ArrayList<TouristPlace>();
		
		bucketlist.sort((TouristPlace p1,TouristPlace p2)->p1.getRank().compareTo(p2.getRank()));
		
		return new LinkedHashSet<TouristPlace>(bucketlist);
	}
	

	
	public Object reset(HashSet <TouristPlace>places) {
		places.clear();
		return places;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

