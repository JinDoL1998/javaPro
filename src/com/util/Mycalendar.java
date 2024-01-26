package com.util;

public class Mycalendar {

	public static boolean isLeapYear(int year) {

		boolean result = false;

		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
			result = true;
		}

		return result;

	}
	
	
/*
	public static String isLeapYear(int year) {

		String result = "평년";

		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { 
			result = "윤년(leap year)";
		}

		return result;

	}
	*/


}
