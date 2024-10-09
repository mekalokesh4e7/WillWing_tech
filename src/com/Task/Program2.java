package com.Task;

import java.util.Scanner;

public class Program2 {

	
	int calculateDifference(int n) {
		int naturalnumSquare = 0;
		int sum2=0;
		for(int i=0;i<=n;i++) {
			
			sum2=sum2+i;
			int sum=(int) Math.pow(i, 2);
			naturalnumSquare=naturalnumSquare+sum;
		}
		int squaresOfSum=naturalnumSquare-(int)Math.pow(sum2,2);
		return squaresOfSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new Program2().calculateDifference(n));
	}

}
