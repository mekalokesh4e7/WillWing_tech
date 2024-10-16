package com.Task;
import java.util.*;
import java.util.StringTokenizer;
public class StateCapitalSeperater {
	
	static Map<String, String> getStates(String stringOfStateCapital, String del1,String del2){
		Map<String, String> statesCapitals= new HashMap<String, String>();
		
		StringTokenizer devidedStatesCapitals=new StringTokenizer(stringOfStateCapital, del2);
		ArrayList<String>devidedSt=new ArrayList<String>();
		while(devidedStatesCapitals.hasMoreTokens()) {
			devidedSt.add(devidedStatesCapitals.nextToken());
		}
		
	
		for(String i:devidedSt) {
			StringTokenizer devidedStates=new StringTokenizer(i, del1);
			while(devidedStates.hasMoreTokens()) {
				String state=devidedStates.nextToken();
				String capital=devidedStates.nextToken();
				statesCapitals.put(state, capital);
			}
		}
		
		return statesCapitals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringOfStateCapital="tamilnadu||chennai-karanataka||bengaluru";
		String del1="||";
		String del2="-";
		System.out.println(getStates(stringOfStateCapital, del1, del2));
	}

}
