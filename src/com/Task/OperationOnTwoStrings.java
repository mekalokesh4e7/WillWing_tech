package com.Tech;


import java.util.Iterator;

public class OperationOnTwoStrings {
	
	static String modifyStringsAlternative(String s1, String s2) {
		StringBuffer SB= new StringBuffer();
		
		for(char i: s1.toCharArray()) {
			if(i%2==0) {
				SB.append(s2);
			}
			else {
				SB.append(i);
			}
		}
		String modString=SB.toString();
		return modString;
	}
	
	static String modifyLastTwoChar(String s1, String s2) {
		StringBuffer SB= new StringBuffer();
		StringBuffer SB1= new StringBuffer(s2);
		  
		String s4[]=s1.split(s2, -1);
		if(s4.length>2) {	
			SB1.reverse();
			char c[]=new char[s1.length()];
			for(int i=0;i<s1.length();i++) {
				c[i]= s1.charAt(i);
				if(i>((s1.length()-1)-s2.length())) {
					SB.append(SB1);
					break;
				}
				else {
					SB.append(c[i]);
				}
			}
			String modString=SB.toString();
			return modString;
		}
		else {
			String n="No common elements";
			return n;
		}
		
	}
	
	
	static String modifyTwoCommonChar(String s1, String s2) {
		//StringBuffer SB= new StringBuffer();
		//StringBuffer SB1= new StringBuffer(s2);
		  
		int FirstString=s1.indexOf(s2);
		int secondString=s1.indexOf(s2	, FirstString+1);
		System.out.println(FirstString+" "+secondString+" "+(s1.length()-1));
		if(secondString!=-1) {
			return s1.substring(0, FirstString)+s1.substring(FirstString+s2.length(), s1.length());
		}
		else {
			return s1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javajava";
		String s2="va";
		System.out.println(" 1) "+modifyStringsAlternative(s1, s2));
		System.out.println(" 2) "+modifyLastTwoChar(s1, s2));
		System.out.println(" 3) "+modifyTwoCommonChar(s1,s2));
	}

}
