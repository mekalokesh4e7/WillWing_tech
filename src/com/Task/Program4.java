package com.Task;

import java.util.Scanner;

public class Program4 {
	boolean checkNumber1(int n) {
		
		String str= Integer.toString(n);
		boolean flag = false;
		int a[]= new int[str.length()];
		for(int i=0;i<str.length();i++) {
			a[i]=Character.getNumericValue(str.charAt(i));   
		}
		for(int i=0;i<str.length()-1;i++) {
			if(a[i]<=a[i+1]) {
				  flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
 		return flag;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new Program4().checkNumber1(n));
	}

}
