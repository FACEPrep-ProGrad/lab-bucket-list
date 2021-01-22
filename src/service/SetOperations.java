package service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations{
	HashSet<Object> set = new HashSet<Object>(); 
	public HashSet add(TouristPlace places) {
		
		set.add(places);
		return set;
	}
	public HashSet remove()
	{
		set.remove(set);
		return set;
	}
	public TreeSet sortByDestination(Set<Object> setobj)
	{
		TreeSet myTreeSet = new TreeSet(setobj);
		return myTreeSet;
	}
	public TreeSet sortByRank(Set<Object> setobj) {
		TreeSet myTreeSet = new TreeSet(setobj);
		return myTreeSet;
	}
	public HashSet reset(Set<Object> setobj) {
		set.clear();
		return set;
	}
}
