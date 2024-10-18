package com.Task;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class VoteEligibility {
	static String invalidPersonName=null;
	
	static boolean dateCriteria(Map<String, String> voterList){
		String dateFormat ="dd/MM/yyyy";
		SimpleDateFormat formater=new SimpleDateFormat(dateFormat);
		Date date = null;
		String dayOfWeekName=null;
		boolean dateEqual = false;
		try {
			for(String i:voterList.keySet()) {
				String voterdate=voterList.get(i);
				date=formater.parse(voterdate);
				dateEqual=voterdate.equals(formater.format (date));
				if(!dateEqual) {
					invalidPersonName=i;
					return false;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return dateEqual;
	}
	
	static ArrayList<String> getDayOfWeek(HashMap<String, String> voterList) {
			ArrayList<String> eligibleVoters=new ArrayList<String>();
			LocalDate presentDate=LocalDate.now();
			for(String i:voterList.keySet()) {
				
				String votersdates=voterList.get(i);
				String[] arrayOfDates=votersdates.split("/");
				LocalDate spliteddate=LocalDate.of(Integer.parseInt(arrayOfDates[2]) ,Integer.parseInt(arrayOfDates[1]),Integer.parseInt(arrayOfDates[0]));
				long noOfYears=Math.abs( ChronoUnit.YEARS.between(presentDate, spliteddate));
				if(noOfYears>=18) {
					eligibleVoters.add(i);
				}
				
			}
			
		return eligibleVoters;
	}
	public static void main(String[] args) {
		
		HashMap<String, String> voterList=new HashMap<String, String>();
		voterList.put("loki", "28/12/2002");
		voterList.put("sai", "26/05/2001");
		voterList.put("bunny", "05/05/2020");
		boolean eligibleDate= dateCriteria(voterList);
		if(eligibleDate==true) {
			System.out.println(getDayOfWeek(voterList));
		}
		else {
			System.out.println("Please enter the correct date for "+invalidPersonName+" the formate id:dd/MM/yyyy ");
		}
	}

}
