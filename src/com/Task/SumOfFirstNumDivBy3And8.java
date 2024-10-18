package com.Task;

public class SumOfFirstNumDivBy3And8 {
	
	static int findSum(int sumOfNum) {
		int sum=0;
		while(sumOfNum>=0) {
			if(sumOfNum%3==0&&sumOfNum%8==0) {
				sum=sum+sumOfNum;
			}
			sumOfNum--;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int sumOfnum=25;
		System.out.println(findSum(sumOfnum));

	}

}
