package com.Task;

import java.util.Scanner;

public class Program3 {
	String getImage(String n) {
		StringBuffer sb=new StringBuffer(n);
		String twoString=n+"|"+sb.reverse();
		//System.out.println(n+"|"+sb.reverse());
		
		return twoString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(new Program3().getImage(n));
	}

}
