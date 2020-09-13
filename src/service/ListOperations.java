package service;
import java.util.ArrayList;
import java.util.List;
import model.TouristPlace;

public class ListOperations{
	
	List<TouristPlace> bucketList = new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) {
		bucketList.add(places);
		return bucketList;
		
	}
	
	public List<TouristPlace> remove(TouristPlace places) {
		bucketList.remove(places);
		return bucketList;
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		
		places.sort((TouristPlace p1, TouristPlace p2) -> p1.getDestination().compareTo(p2.getDestination()));
		return places;
	}
	
	public Object sortByRank(List<TouristPlace> places) {
		
		places.sort((TouristPlace p1, TouristPlace p2) -> p1.getRank().compareTo(p2.getRank()));
		return places;
	}
	
	public Object reset(List<TouristPlace> places){
		places.clear();
		return places;
	}
	
} 