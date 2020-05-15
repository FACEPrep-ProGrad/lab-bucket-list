package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.*;

public class ListOperations
{
	List<TouristPlace> placesList= new  ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places)
	{
		placesList.add(places);
		return placesList;
		
	}
	public List<TouristPlace> remove(TouristPlace places)
	{
		placesList.remove(places);
		return placesList;
		
	}
	public Object sortByDestination(List<TouristPlace> places)
	{
		Collections.sort(places,(d1,d2)-> d1.getDestination().compareTo(d2.getDestination()));
		return places;
		
	}
	public Object sortByRank(List<TouristPlace> places)
	{
		Collections.sort(places,(d1,d2)-> d1.getRank().compareTo(d2.getRank()));
		return places;
		
	}
	public Object reset(List<TouristPlace> places)
	{
		places.clear();
		return places;
		
	}

}
