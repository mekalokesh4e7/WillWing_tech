package com.Task;

import java.util.Scanner;

public class Program5 {
	boolean checkNumber2(int n) {
		
		for(int i=0;i<=n;i++) {
			if((int)Math.pow(2, i)==n) {
				return true;
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println( new Program5().checkNumber2(n));
	}

}
