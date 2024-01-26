package days11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex01 {

	public static void main(String[] args) {

		int year = 2020, month = 5;

		printCalendar(year, month);

	}

	private static void printCalendar(int year, int month) {
		// 1. 무슨 요일
		int dayOfWeek = getDayOfWeek(year, month, 1);

		// 2. 몇 일
		int lastDay = geLastDay(year, month);

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
	}

	private static int geLastDay(int year, int month) {
		// Date, Calendar 클래스 - 날짜, 시간
		LocalDate d = LocalDate.of(year, month, 1);
		d.withDayOfMonth(d.lengthOfMonth());
		LocalDate ld = d.withDayOfMonth(d.lengthOfMonth());
		int lastDay = ld.getDayOfMonth();

		return lastDay;
	}

	private static int getDayOfWeek(int year, int month, int i) {
		LocalDate d = LocalDate.of(year, month, 1);
		DayOfWeek w = d.getDayOfWeek();

		return w.getValue();
	}
	
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.parse("0001-01-01");
		LocalDate endDate = LocalDate.of(year, month, day);
		
		// 5월 1일까지니까 + 1
		return (int)(startDate.until(endDate, ChronoUnit.DAYS)) + 1;
	}

}
