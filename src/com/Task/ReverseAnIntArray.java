package com.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ReverseAnIntArray {
	
	static Integer[] getSorted(int[] n) {
		ArrayList<Integer> RverseInt=new ArrayList<Integer>();
		for(int i=0;i<n.length;i++) {
			int j=n[i];
			int reverse=0;
			while(j!=0) {
				int rev=j%10;
				reverse=reverse*10+rev;
				j=j/10;
			}
			
			RverseInt.add(reverse);
		}
		Collections.sort(RverseInt);
		
		return  RverseInt.toArray(new Integer[0]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {21,32,132,32,55};
		Integer[]reversedValue=getSorted(n);
		for(int i:reversedValue) {
			System.out.println(i);
		}
		
	}

}
