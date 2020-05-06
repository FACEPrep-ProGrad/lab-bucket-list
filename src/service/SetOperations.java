package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;

public class  SetOperations{
	

public HashSet<TouristPlace> add(TouristPlace places){
	
	Set<TouristPlace> addPlace=new HashSet<>();	
	addPlace.add(places);
	return (HashSet<TouristPlace>) addPlace;

}
public HashSet<TouristPlace> remove(TouristPlace places){
	
	Set<TouristPlace> removePlace=new HashSet<>();	
	removePlace.remove(places);
	return  (HashSet<TouristPlace>) removePlace;
	
	
}
public Object sortByDestination(HashSet<TouristPlace> places) {
	
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>((d1, d2) -> {
		return d1.getDestination().compareTo(d2.getDestination());
	});
		
	return ts;
	

	
}
public Object sortByRank(HashSet<TouristPlace> places) {
	
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>((r1, r2) -> {
		return r1.getRank().compareTo(r2.getRank());
	});
		
	return ts;
	
}
public Object reset(HashSet<TouristPlace> places) {
	TreeSet<TouristPlace> ts = new TreeSet<TouristPlace>();
	ts.clear();
	return ts;
	
}

}