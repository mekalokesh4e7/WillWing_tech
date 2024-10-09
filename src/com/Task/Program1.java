package com.Task;

import java.util.Scanner;

public class Program1 {
	
	int sum=0;
	
	int calculateSum(int n) {
		for(int i=0;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new Program1().calculateSum(n));
	}

}
