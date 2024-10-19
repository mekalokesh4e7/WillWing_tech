package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PerfectCouples {
	
	static List<Integer> checkPerfectCouple(Map<Integer, String> listOfcouples){
		List<Integer> listOfperfect=new ArrayList<Integer>();
		for(int i:listOfcouples.keySet()) {
			String value=listOfcouples.get(i).toLowerCase();
			StringTokenizer devidedValues=new StringTokenizer(value,"-");
			while(devidedValues.hasMoreTokens()){
				String husband=devidedValues.nextToken();
				String wife=devidedValues.nextToken();
				char[] husbandArray=husband.toCharArray();
				char[] wifeArray=wife.toCharArray();
				Arrays.sort(husbandArray);
				Arrays.sort(wifeArray);
				String h1=  new String(husbandArray);
				String h2=	new String(wifeArray);	
				if(h1.equals(h2)) {
					listOfperfect.add(i);
				}
				else {
					continue;
				}
			}
		
			
		}
		return listOfperfect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> listOfcouples=new HashMap<Integer, String>();
		listOfcouples.put(1, "VIMAL-LAMIV");
		listOfcouples.put(2, "LOKESH-PRATHYUSHA");
		System.out.println(checkPerfectCouple(listOfcouples));
	}

}
