package service;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.*;

public class MapOperations
{
	
	
	public Map<Integer,TouristPlace> add(TouristPlace places)
	{
		Map<Integer,TouristPlace> tp=new HashMap<>();
		tp.put(null, places);
		return tp;
	}
	public Map<Integer,TouristPlace> sortRandomly(TouristPlace places)
	{
		Map<Integer,TouristPlace> sr=new HashMap<>();
		sr.put(null, places);
		return sr;
	}
	public Map<Integer,TouristPlace> sortInEntryOrder(TouristPlace places)
	{
		Map<Integer,TouristPlace> se=new LinkedHashMap<>();
		se.put( null, places);
		return se;
		
	}
	public Map<Integer,TouristPlace> sortAlphabetically(TouristPlace places)
	{
		Map<Integer,TouristPlace> sa=new TreeMap<>();
		sa.put( null, places);
		return sa;	
	}
	public Object reset(HashMap<Integer, TouristPlace> places)
	{
		Map<Integer,TouristPlace> resetPlaces=new TreeMap<>();
		resetPlaces.clear();
		return resetPlaces;
	}
	public Map<Integer,TouristPlace> remove(TouristPlace places)
	{
		Map<Integer,TouristPlace> rp=new HashMap<>();
		rp.remove( null, places);
		return rp;
	}

}

