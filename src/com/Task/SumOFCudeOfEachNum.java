package com.Task;

public class SumOFCudeOfEachNum {
	
	static int findSum(int Num) {
		int sum=0;
		while(Num>0) {
			int spitedNum=Num%10;
			sum=(int) (sum+Math.pow(spitedNum, 3));
			Num=Num/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.println(findSum(123));

	}

}
