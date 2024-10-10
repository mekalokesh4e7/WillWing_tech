package com.Task;

public class UserNameRestrictions {
	
	boolean validateUserName(String Name) {
		int nameLength= Name.length()-"_job".length();
		if(Name==null||nameLength<=8||!Name.contains("_job")) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new UserNameRestrictions().validateUserName("kasugrg_job"));
	}

}
