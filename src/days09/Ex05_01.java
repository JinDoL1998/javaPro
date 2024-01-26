package days09;

import java.util.Calendar;
import java.util.Date;

public class Ex05_01 {

	public static void main(String[] args) {

		String rrn = "980629-1234567";
		String birthDay = getBirth(rrn);
		System.out.println(birthDay);

		int yearAge = getYearAge(rrn);
		int koreaAge = getKoreaAge(rrn);
		int americaAge = getAmericanAge(rrn);
		System.out.printf("%s - 연나이:%d살, 한국식나이:%d살, 만나이 : %d살\n", rrn, yearAge, koreaAge, americaAge);

	} // main

	// 한국식 나이 연나이 + 1
	private static int getKoreaAge(String rrn) {


		return getYearAge(rrn) + 1;
	}

	// 연 나이 = 올해연도 - 출생연도
	private static int getYearAge(String rrn) {

		int birthYear;

		// Calendar 날짜 시간 클래스
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(Calendar.YEAR);

		/* Date : 날짜 시간 클래스
		Date date = new Date();
		int thisYear = date.getYear() + 1900;
		 */

		System.out.println(thisYear);

		birthYear = Integer.parseInt(rrn.substring(0, 2));
		int gender = getGender(rrn);
		switch (gender) {
		case 9: case 0:
			birthYear += 1800;
			break;

		case 1: case 2: case 5: case 6:
			birthYear +=1900;
			break;

		case 3: case 4: case 7: case 8:
			birthYear += 2000;
			break;

		}

		return thisYear - birthYear;
	}

	// 만 나이
	private static int getAmericanAge(String rrn) {
		
		Calendar calendar = Calendar.getInstance();
		int thisMonth = calendar.get(Calendar.MONTH) + 1;
		int thisDay = calendar.get(Calendar.DATE);
		int birthMonth = Integer.parseInt(rrn.substring(2, 4));
		int birthDay = Integer.parseInt(rrn.substring(4, 6));
		
		if ( !(thisMonth >= birthMonth && thisDay >= birthDay)) {
			 
				return getYearAge(rrn) - 1;
			
		}
		
		return getYearAge(rrn);
		
		
	}


	private static int getGender(String rrn) {

		// char		rrn.charAt(7);		'1' - 48
		// String 	rrn.subString(7,8)	"1" Integer.paresInt()

		return rrn.charAt(7) - 48;
	}



	private static String getBirth(String rrn) {

		int year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));

		// year = 1999,1899
		int gender = getGender(rrn);
		// 9,0 1800
		// 1,2,5,6 1900
		// 3,4,7,8 2000
		switch (gender) {
		case 9: case 0:
			year += 1800;
			break;

		case 1: case 2: case 5: case 6:
			year +=1900;
			break;

		case 3: case 4: case 7: case 8:
			year += 2000;
			break;

		}

		String birthDay= String.format("%d년 %d월 %d일", year, month, day);

		return birthDay;

	} // getBirth



}
