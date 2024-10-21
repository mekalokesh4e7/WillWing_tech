package com.Task;

public class FibonacciSeries {
	static int[] faibonocci;
	static int[] faibomacci(int num1) {
		faibonocci=new int[num1];
		faibonocci[0]=0;
		faibonocci[1]=1;
		int first=0;
		int second=1;
		int num3;
		for(int i=2;i<num1;i++) {
			
			num3=first+second;
			first=second;
			second=num3;
			faibonocci[i]=num3;
		}
		return faibonocci;
	}
	static int factorial(int[]faibonacci) {
		int sum=0;
		for(int j=0;j<faibonacci.length;j++) {
			int fac=1;
			if(faibonacci[j]>1) {
				for(int i=1;i<=faibonacci[j];i++) {
					fac=fac*i;
				}
			}
			
			sum=sum+fac;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] fainocci=faibomacci(6);
		System.out.print(factorial(faibonocci));
	}

}