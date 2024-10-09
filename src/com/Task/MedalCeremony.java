package com.Task;

import java.util.HashMap;
import java.util.Scanner;

public class MedalCeremony {
	static Scanner sc= new Scanner(System.in);
	HashMap gatStudents(int Students){
		
		HashMap<Integer, Integer> studentDetails= new HashMap<>();
		for(int i=0;i<Students;i++) {
			System.out.println("Enter Student ID:");
			int StudentId=sc.nextInt();
			System.out.println("Enter Student Marks:");
			int StudentMarks=sc.nextInt();
			studentDetails.put(StudentId, StudentMarks);
      
		}
		return studentDetails;
	}
	HashMap<Integer, String> ListOfMedalsCeremony(int Students){
    
		HashMap<Integer, Integer> StudentDetails= new MedalCeremony().gatStudents(Students);
    
		HashMap<Integer, String> MedalDetails= new HashMap<Integer, String>();
		for(Integer id:StudentDetails.keySet()) {
			int Marks=StudentDetails.get(id);
			if(Marks>=90) {
				MedalDetails.put(id, "Gold");
			}
			else if(Marks>=80) {
				MedalDetails.put(id, "Silver");
			}
			else if(Marks>=70) {
				MedalDetails.put(id, "Bronze");
			}
			else {
				continue;
			}
		}
		return MedalDetails;
		
	}
		
	public static void main(String[] args) {
	
		System.out.println("Enter the total No. of Students:");
		int Students=sc.nextInt();
		System.out.println(new MedalCeremony().ListOfMedalsCeremony(Students));
    
	}

}
