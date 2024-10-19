package com.Task;

import java.util.ArrayList;

public class EncryptionOfString {
	
	static ArrayList<Character> encryptString(String name) {
		char[] stringArray=name.toCharArray();
		ArrayList<Character> encrypt= new ArrayList<Character>();
		for(char i:stringArray) {
			int assci=(int)i;
			int sum=assci+9;
			if(sum<=122 && sum>=97) {
				encrypt.add((char)sum);
			}
			else{
				sum=sum-122;
				sum=sum+97;
				encrypt.add((char)sum);
			}
		}
		return encrypt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encryptString("lokesh"));
	}

}
