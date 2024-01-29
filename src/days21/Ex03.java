package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// 년
		int year = ld.get(ChronoField.YEAR);
		System.out.println(year);
		year = ld.getYear();
		System.out.println(year);
		
		// 월
		int month = ld.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		month = ld.getMonthValue();
		System.out.println(month);
		
		Month emonth = ld.getMonth();
		System.out.println(emonth);
		
		// 일
		int day = ld.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		day = ld.getDayOfMonth();
		System.out.println(day);
		
		LocalTime lt = LocalTime.now();
		// 시간
		int hour = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hour);
		hour = lt.getHour();
		System.out.println(hour);
		
		// 분
		int minute = lt.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(minute);
		minute = lt.getMinute();
		System.out.println(minute);
		
		// 초
		int second = lt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(second);
		second = lt.getSecond();
		System.out.println(second);
		
		// 밀리초
		int milliSecond = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(milliSecond);
		int nanoSecond = lt.getNano();
		System.out.println(nanoSecond/1000000);
		
		// 요일
		int date = ld.get(ChronoField.DAY_OF_WEEK);
		System.out.println(date);	// time : 월(1) ~ 일(7)
									// date : 일(0) ~ 토(6)
								// calendar : 일(1) ~ 토(7)
		
		DayOfWeek edow = ld.getDayOfWeek();
		System.out.println(edow);
		System.out.println(edow.getValue());
		
		
		
		// 현재 날짜를 가져옴		
        LocalDate currentDate = LocalDate.now();

        // 요일을 가져옴
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // 요일을 월요일 형식으로 문자열로 변환
		String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
		System.out.println("현재 요일: " + dayOfWeekString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
