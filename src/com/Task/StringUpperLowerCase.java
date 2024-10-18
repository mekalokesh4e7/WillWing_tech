package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringUpperLowerCase {
	
	static String[] getArraylist(String[] arrayOfStrings) {                
		
		String[] convertedArrayOfString=new String[arrayOfStrings.length];
		ArrayList<String> listOfString=new ArrayList<String>(Arrays.asList(arrayOfStrings));
		listOfString.replaceAll(String::toLowerCase);
		Collections.sort(listOfString);
		int index=0;
		for(String i:listOfString) {
			if(listOfString.size()%2==1) {
				if(index<((listOfString.size()/2)+1)) {
					convertedArrayOfString[index]=i.toUpperCase();
				}
				else {
					convertedArrayOfString[index]=i.toLowerCase();
				}
			}
			else {
				if(index<(listOfString.size()/2)) {
					convertedArrayOfString[index]=i.toUpperCase();
				}
				else {
					convertedArrayOfString[index]=i.toLowerCase();
				}
			}
			index++;
		}
		return convertedArrayOfString;
	}
	
	
	public static void main(String[] args) {
		
		String[] arrayString={"Lokesh","Sai","chandu","bunny","loki"};
		arrayString.toString().toUpperCase();
		String[] convertedStringArray=getArraylist(arrayString);
		for(String i:convertedStringArray) {
			System.out.println(i);
		}
	}
}
