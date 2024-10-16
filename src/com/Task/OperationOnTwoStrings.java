package com.Task;


import java.lang.reflect.Array;
import java.nio.file.attribute.AclEntry;
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
		StringBuffer SB1= new StringBuffer(s2);
		SB1.reverse();
		String gj = "(?i)" + s2;
		String s4[]=s1.split(gj);
		if(s4.length>=2) {
			String firstIndex=s1.substring(0, s1.length()- s2.length());
			return firstIndex+SB1;
		}
		else {
			return "No Common vlaues";
		}
	}
	
	
	static String modifyTwoCommonChar(String s1, String s2) {
		String s3[]=s1.split("(?i)"+s2);
		if(s3.length>=2) {
			String modify=s1.replaceFirst("(?i)"+s2,"");
			return modify;
		}
		else {
			return s1;
		}
		
		
	}
	
	static String modifyThePositionOfStrings(String s1, String s2) {
		
		if(s2.length()%2==0){
			String fistHalf=s2.substring(0, s2.length()/2); 
			String secondHalf=s2.substring(s2.length()/2, s2.length());
			return fistHalf+s1+secondHalf;
		}
		else{
			int mid=(s2.length()/2)+1;
			String fistHalf=s2.substring(0, mid); 
			String secondHalf=s2.substring(mid, s2.length());
			return fistHalf+s1+secondHalf;
		}
	}
	
	static StringBuffer modifyTheCommonWithStar(String s1, String s2) {
		//System.out.println( s2.indexOf(s1));
		StringBuffer sb= new StringBuffer();
		String mo="(?i)"+s2;
		for(char i:s1.toCharArray()) {
			if(s2.toLowerCase().indexOf(i)!=-1) {
				sb.append("*");
			}
			else {
				sb.append(i);
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javajava";
		String s2="VVA";
		System.out.println(" 1) "+modifyStringsAlternative(s1, s2));
		System.out.println(" 2) "+modifyLastTwoChar(s1, s2));
		System.out.println(" 3) "+modifyTwoCommonChar(s1,s2));
		System.out.println(" 4) "+modifyThePositionOfStrings(s1, s2));
		System.out.println(" 5) "+modifyTheCommonWithStar(s1, s2));
	}

}
