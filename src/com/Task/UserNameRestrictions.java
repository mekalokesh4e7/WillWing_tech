package com.Task;

public class UserNameRestrictions {
	
	boolean validateUserName(String Name) {
		int nameLength= Name.length()-"_job".length();
		if(nameLength<=8||!Name.endsWith("_job")) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new UserNameRestrictions().validateUserName("kasujlgrg_job"));
	}

}
