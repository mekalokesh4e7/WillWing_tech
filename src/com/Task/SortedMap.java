package com.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedMap {

	static List<String> getVales(Map<Integer, String> mapList){
		ArrayList<String> sortedValues=new ArrayList<String>();
		for(int i:mapList.keySet()) {
			String values=mapList.get(i);
			values.toUpperCase();
			sortedValues.add(values);
		}
		Collections.sort(sortedValues);
		return sortedValues;
	}
	
	public static void main(String[] args) {
		  Map<Integer, String> mapList=new HashMap<Integer, String>();
		  mapList.put(1, "Lokesh");
		  mapList.put(2, "Bunny");
		  mapList.put(3, "Sai");
		  System.out.println(getVales(mapList));
	}

}
