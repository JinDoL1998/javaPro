package days10;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.util.Mycalendar;

public class Ex02 {

	public static void main(String[] args) {

		int year, month;	// 달력의 년도와 월

		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("> 년도 월 입력 | ");
			year = scanner.nextInt();
			month = scanner.nextInt();

			// 달력그리기
			printCalendar(year, month);

		} catch (Exception e) {
			e.printStackTrace();  // 예외 발생 정보 확인
		}



	}

	// 2020. 5
	// 총 날짜 수 % 7 = 0(일) 1(월) 2(화)... 6(토)
	private static void printCalendar(int year, int month) {

		// 1. 해당 연도, 해당 월 1일이 무슨요일
		// 2. year, month 마지막 날짜 ?

		//		Date d = new Date(year - 1900, month - 1, 1);
		//		System.out.println(d.toLocaleString());
		//		System.out.println("일월화수목금토".charAt(d.getDay()));

		int dayOfWeek = getDay(year, month, 1);

		// 2. year, month 마지막 날짜 ?
		int lastDay = getLastDay(year, month);
		
		// 달력 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String week = "일월화수목금토";
		for(int i =0;i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println();
		System.out.println("-".repeat(60));
		
		// 1의 위치를 잡기 위해서 앞에 \t 위치 for
		for(int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		// System.out.printf("\t%d", 1);
		for(int i = 1; i <= lastDay; i++) {
			System.out.printf("\t%d", i);
			
			if((i + dayOfWeek) % 7 == 0) System.out.println();
		}
		
		System.out.println();
		System.out.println("-".repeat(60));
		
		//	int lastDay = getLastDay(year,month);

	} //printCalendar


	private static int getLastDay(int year, int month) {

		int lastDay = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		return lastDay;
	}

	/*
	private static int getLastDay(int year, int month) {

		int lastDay = 0;

		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};

		lastDay = months[month-1];
		if(MyCalendar.isLeapYear(year) && month == 2) lastDay = 29;

		return lastDay;
	}
	 */
	
	/*
	private static int getLastDay(int year, int month) {

		int lastDay = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;

		case 2:
			lastDay = Mycalendar.isLeapYear(year) ? 29 : 28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;

		}
		return lastDay;
	} // getLastDay
	 */

	private static int getDay(int year, int month, int date) {

		// 1.1.1 ~ year, month,1 총 날짜수 % 7
		// 0 ~ 6

		int totalDates = getTotalDates(year, month, date);
		int dayOfWeek = totalDates % 7;
		return dayOfWeek;
	} // getDay

	public static int getTotalDates(int year, int month, int date) {
		// year 2020 , month 5, day 1
		// 365 * 2019(year-1) + 20.1(31) + 2(29) + 3(31) + 4(30) + 1
		int totalDates = 0;

		/*
		for (int i = 1; i < year; i++) {
			totalDates += Mycalendar.isLeapYear(i) ? 366 : 365;
		}
		 */

		totalDates = (year-1) * 365 + (year-1)/4 - (year-1)/100 + (year-1)/400;

		for (int i = 1; i < month; i++) {
			totalDates += getLastDay(year, i); 
		}

		totalDates++;   
		
		// System.out.println(">" + totalDates);
		

		return totalDates;
	}

}
