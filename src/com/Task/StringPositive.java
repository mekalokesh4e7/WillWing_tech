package com.Task;

public class StringPositive {

	static boolean checkPositive(String fullString) {
		boolean positive=false;
		char[] charString=fullString.toCharArray();
		for(int i=0;i<charString.length-1;i++) {
			int assci=(int)charString[i];
			int assci1=(int)charString[i+1];
			if(assci<=assci1) {
				positive= true;
			}
			else {
				positive=false;
				break;
			}
		}
		return positive;
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkPositive("abcde"));

	}

}
