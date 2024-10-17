package com.Task;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WeekOfTheDay {
	
	static String getDayOfWeek(String date1,String dateFormat) {
			SimpleDateFormat formater=new SimpleDateFormat(dateFormat);
			Date date = null;
			String dayOfWeekName=null;
			boolean dateEqual = false;
			try {
				date = formater.parse(date1);
				dateEqual=date1.equals(formater.format (date));
				if(dateEqual) {
					Calendar calender=Calendar.getInstance();
					calender.setTime(date);
					SimpleDateFormat formater1=new SimpleDateFormat("EEEE",Locale.ENGLISH);
					dayOfWeekName=formater1.format(date);
				}
				else {
					return "Please enter the currect dated format";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return dayOfWeekName;
}
	public static void main(String[] args) {
		
		String date="32/01/2024";
		String dateFormat="dd/MM/yyyy";
		System.out.println(getDayOfWeek(date,dateFormat));
	}

}
