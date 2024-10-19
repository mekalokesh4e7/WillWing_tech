package com.Task;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArray {

	static List<String> modifyElement(List<String> arrayElements, String element){
			ArrayList<String> Arraylist=new ArrayList<String>();
			int strin;
		   for(String i:arrayElements) {
			   strin=i.indexOf(element, -1);
			   if(strin!=-1) {
				   Arraylist.add(element);
			   }
			   else {
				   Arraylist.add(i);
			   }
		   }
		   return Arraylist;
		
	}
	
	public static void main(String[] args) {
		ArrayList<String>Arraylist1=new ArrayList<String>();
		Arraylist1.add("Lokesh");
		Arraylist1.add("Bunny");
		String element="Bun";
		System.out.println(modifyElement(Arraylist1, element));
		
	}

}
