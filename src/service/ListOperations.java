package service;

import java.util.ArrayList;
import java.util.List;
import model.TouristPlace;

public class  ListOperations {
	
	public List<TouristPlace> add(TouristPlace places){
		ArrayList<TouristPlace> addPlace=new ArrayList<>();	
		addPlace.add(places);
		return addPlace;
	}
	
	public List<TouristPlace> remove(TouristPlace places){
ArrayList<TouristPlace> removePlace=new ArrayList<>();		
		removePlace.remove(places);
		return removePlace;	
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		ArrayList<TouristPlace> sortByDestinationPlace=new ArrayList<>();	
		sortByDestinationPlace.sort((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
		return sortByDestinationPlace;
		
		}
		
	public Object sortByRank(List<TouristPlace> places) {
		ArrayList<TouristPlace> sortByRankPlace=new ArrayList<>();	
		 sortByRankPlace.sort((r1,r2) -> r1.getRank().compareTo(r2.getRank()));
		return sortByRankPlace;	
	}
	
	public Object reset(List<TouristPlace> places) {
		ArrayList<TouristPlace> clearPlaces=new ArrayList<>();	
	clearPlaces.clear();
		return clearPlaces;
	}
}