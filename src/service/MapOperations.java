package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

import model.TouristPlace;

    
public class MapOperations{
	
	private static final String TouristPlace = null;
	HashMap<String,TouristPlace> map=new HashMap<String,TouristPlace>();
	TreeMap<Integer,TouristPlace> map2=new TreeMap<Integer,TouristPlace>();

	
    public HashMap<String,TouristPlace> add(TouristPlace places) throws IOException 
{
    	
    	String i =places.getRank();
	map.put(i,places);
	return  map;
}
    public TreeMap<Integer,TouristPlace> sortRandomly(TouristPlace places) throws IOException
    {
    	int i=Integer.parseInt(places.getRank());
    	map2.put(i,places);    	
		return map2;   
    }
    
    public LinkedHashMap<String,TouristPlace> sortInEntryOrder(HashMap<String,TouristPlace> places) throws IOException
    {
    	LinkedHashMap<String,TouristPlace> map1=new LinkedHashMap<String,TouristPlace>();
    	
    	for(Entry<String, model.TouristPlace> pair : places.entrySet())
    	{
    		String key =pair.getKey();  		
    		TouristPlace value = pair.getValue();
    		map1.put(key,value);
    		
    		}
    		
		return map1;
    	
    }
    public TreeMap<String,TouristPlace> sortAlphabetically(HashMap<String,TouristPlace> places) throws IOException
    {
    	TreeMap<String,TouristPlace> map2=new TreeMap<String,TouristPlace>();
    	for(Entry<String, model.TouristPlace> pair : places.entrySet())
    	{
    		String key =pair.getKey();
    		
    		TouristPlace value = pair.getValue();
    		map2.put(key,value);
    		}    
    	return map2;	
    }
}