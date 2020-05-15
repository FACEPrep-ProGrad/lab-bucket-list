package service;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import model.*;
public class SetOperations
{
	public HashSet<TouristPlace> add(TouristPlace places)
	{
		HashSet<TouristPlace> a= new HashSet<TouristPlace>();
		a.add(places);
		return a;
	}
	public HashSet<TouristPlace> remove(TouristPlace places)
	{
		HashSet<TouristPlace> rm= new HashSet<TouristPlace>();
		rm.remove(places);
		return null;
	}
	public Object sortByDestination(HashSet<TouristPlace> places)
	{
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	public Object sortByRank(HashSet<TouristPlace> places)
	{
		TreeSet<TouristPlace> sr=new TreeSet<>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sr;
	}
	public Object reset(HashSet<TouristPlace> places)
	{
		HashSet<TouristPlace> cl=new HashSet<>();
        cl.clear();
		return cl;
	}

}
