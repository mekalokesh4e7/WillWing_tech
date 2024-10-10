package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveUnIdenticals {
	static Scanner sc= new Scanner(System.in);
	List getList1(int n) {
		
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("Enter the List-1 which containg:"+n);
		
		for(int i=0;i<n;i++) {
			list1.add(sc.nextInt());
		}
		
		return list1;
		
	}
	List getList2(int n) {
		
		List<Integer> list2=new ArrayList<Integer>();
		System.out.println("Enter the List-1 which containg:"+n);
		
		for(int i=0;i<n;i++) {
			list2.add(sc.nextInt());
		}
		
		return list2;
		
	}
	List removeElements(List<Integer>list1, List<Integer>list2) {
		
		//list1.removeAll(list2);
		list1.retainAll(list2);
		return list1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the total ");
		List<Integer> list1=new RemoveUnIdenticals().getList1(5);
		List<Integer> list2=new RemoveUnIdenticals().getList2(5);
		System.out.println(list1+"   "+list2+" = "+new RemoveUnIdenticals().removeElements(list1, list2));
		
	}

}
