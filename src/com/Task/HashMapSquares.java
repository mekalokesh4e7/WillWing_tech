package com.Task;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSquares {
	static Scanner sc= new Scanner(System.in);
	
	int[] getNumbers(int Tnum) {
		int [] listnum= new int[Tnum];
		System.out.println("Enter total numbers:"+Tnum);
		for(int i=0;i<Tnum;i++) {
			listnum[i]=sc.nextInt();
		}
		return listnum;
	}
	
	HashMap squaresOfNum(int Tnum) {
		int [] listnum=new HashMapSquares().getNumbers(Tnum);
		HashMap<Integer, Integer> listOfSquares=new HashMap<Integer, Integer>();
		for(Integer id:listnum) {
			int Squares=(int) Math.pow(id, id);
		
			listOfSquares.put(id, Squares);
		}
		return listOfSquares;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Total List of Numbers:");
		int totalNum=sc.nextInt();
		System.out.println(new HashMapSquares().squaresOfNum(totalNum));
	}

}
