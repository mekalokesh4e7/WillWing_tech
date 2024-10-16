package com.Task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemovesDuplicatesArray {
	
	static Integer[] sortArray(Integer[] n) {
		
		TreeSet<Integer> ts1=Arrays.stream(n).collect(Collectors.toCollection(TreeSet::new));
		int T=ts1.size();
		Integer[] a=new Integer[T];
		Iterator<Integer> k=ts1.descendingIterator();
		
		for(int i=0;i<T;i++) {
			a[i]=k.next();
		}
		return a;

	}

	public static void main(String[] args) {
		
		Integer []n= {1,2,3,4,5,65,65,65,65,56,56,56,89,89,89874,9896,4596,2,3,2,1,3,6,8,9,12,54,5,4};
		Integer []k=sortArray(n);
		for(int i:k) {
			System.out.println(i);
		}
		System.out.println();
	}

}
