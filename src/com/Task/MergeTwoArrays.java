package com.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrays {
	
	static Character[] mergeData(List<Character> charArray1, List<Character> charArray2) {
		
		charArray1.addAll(charArray2);
		Collections.sort(charArray1);
		
		int count=charArray1.size();
		Character[] newChar=new Character[count];
		newChar=charArray1.toArray(newChar);
		
		return newChar;
	}
	
	public static void main(String[] args) {
		ArrayList<Character> charArray1=new ArrayList<Character>(Arrays.asList('D','C','B','A'));
		ArrayList<Character> charArray2=new ArrayList<Character>(Arrays.asList('E','F','G','H'));
		Character[] newChar=mergeData(charArray1 , charArray2);
		for(char i:newChar) {
			System.out.println(i);
		}
	
	}

}
