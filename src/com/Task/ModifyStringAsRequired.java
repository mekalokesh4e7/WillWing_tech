package com.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ModifyStringAsRequired {
 static Scanner sc=new Scanner(System.in);
	static String changeString(String mString,char opt1) {
		char option= Character.toUpperCase(opt1);
		switch (option) {
		case 'A': {
			return mString+mString;
		}
		case 'B': {
			char[] stringChar= mString.toCharArray();
			for(int i=0;i<stringChar.length;i++) {
				if(i%2==1) {
					stringChar[i]='*';
				}
				else {
					stringChar[i]=stringChar[i];
				}
			}
			return new String(stringChar);
		}
		case 'C':{
			StringBuffer sb=new StringBuffer();
			char[] stringChar= mString.toCharArray();
			LinkedHashSet<Character> hashSetString=new LinkedHashSet<Character>();
			for(int i=0;i<stringChar.length;i++) {
				hashSetString.add(stringChar[i]);
			}
			for(char ch:hashSetString) {
				sb.append(ch);
			}
			return sb.toString();
		}
		case 'D':{
			char[] stringChar= mString.toCharArray();
			for(int i=0;i<stringChar.length;i++) {
				if(i%2==1) {
					stringChar[i]= Character.toUpperCase(stringChar[i]);
				}
				else {
					stringChar[i]=Character.toLowerCase(stringChar[i]);
				}
			}
			return new String(stringChar);
		}
		default : return "Please enter the value under A to D";
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String modificationStr="chandra";
		char option='a';
		System.out.println(changeString(modificationStr, option));
	}

}
