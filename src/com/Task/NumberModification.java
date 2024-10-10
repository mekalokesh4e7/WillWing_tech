package com.Task;

import java.util.Scanner;

public class NumberModification {
	
	int modifyNumber(int num) {
		int Mof=0;
		int j=0;
		String Mstr= Integer.toString(num);
		StringBuffer sb=new StringBuffer("");
		int a[]= new int[Mstr.length()];
		for(int i=0;i<Mstr.length();i++) {
			a[i]=Mstr.charAt(i)-'0';
		}
		for(int i=0;i<Mstr.length()-1;i++) {
			//System.out.println(Mstr.charAt(i));
			Mof=Math.abs(a[i+1]-a[i]);
			sb.insert(j, Mof);
			j++;
		}
		sb.append(Math.abs(a[Mstr.length()-1]-a[0]));
		String sb1=sb.toString();
		int Converted=Integer.parseInt(sb1);
		return Converted;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc= new Scanner(System.in);

		int num=sc.nextInt();
		System.out.println( new NumberModification().modifyNumber(num));
	}

}
