package com.Task;

import java.util.HashMap;
import java.util.Map;

public class CountNumOFCommChar {

	static Map<Character, Integer> countCharacters(char[]n){
		Map<Character, Integer> mapList=new HashMap<Character, Integer>();
		for(char i:n) {
			mapList.put(i, mapList.getOrDefault(i, 0)+1);
		}
		
		return mapList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]n= {'A','P','P','L','E','j','k','i','a','p','P','P','A'};
		Map<Character,Integer> mapList=countCharacters(n);
		System.out.println(mapList);
	}

}
