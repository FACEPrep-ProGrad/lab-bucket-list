package service;

import java.util.*;

import model.TouristPlace;

public class SetOperations{
	
	Set set=new HashSet<TouristPlace>();


	public Set add(TouristPlace places){
		set.add(places);
		return set;
	}


	public Set remove(TouristPlace places){
		set.remove(places);
		return set;
	}


	public Object sortByDestination(Set<TouristPlace> places) {

		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();

		list.sort((TouristPlace place1,TouristPlace place2)->place1.getDestination().compareTo(place2.getDestination()));

		return new LinkedHashSet<TouristPlace>(list);

		}


	public Object sortByRank(HashSet <TouristPlace>places) {

		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();

		list.sort((TouristPlace place1,TouristPlace place2)->place1.getRank().compareTo(place2.getRank()));

		return new LinkedHashSet<TouristPlace>(list);
	}



	public Object reset(HashSet <TouristPlace>places) {
		places.clear();
		return places;
	}


}