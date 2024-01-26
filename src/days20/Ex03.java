package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author jinseong
 * @date 2024. 1. 26. - 오후 12:20:33
 * @subject	days19 Ex11_02
 * @content	
 */
public class Ex03 {

	public static final String FONT_YELLOW = "\u001B[33m";
	public static final String RESET = "\u001B[0m";
	
	public static void main(String[] args) {

		int year = 2024;
		int month = 2;

		// int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);
		
		// System.out.println(lastDay);
		
		Calendar start = new GregorianCalendar(year, month-1, 1);
		start.add(Calendar.DATE, -dayOfWeek);
		
		
		// System.out.println(Ex02.getFormatDate(start, "yyyy-MM-dd"));
		Calendar today = Calendar.getInstance();
		
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		
		for(int i = 0; i < 42; i++) {
			if(start.get(Calendar.MONTH)+1 != month) {
				if(today.equals(start)) {
					System.out.print("*");
				}
				System.out.printf(FONT_YELLOW + "%02d\t" + RESET, start.get(Calendar.DATE));
			} else {
				System.out.printf("%02d\t", start.get(Calendar.DATE));
			}
			start.add(Calendar.DATE, 1);
			if(i % 7 == 6) System.out.println();
		}
		

	} // main

	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
	
		return c.getActualMaximum(Calendar.DATE); 
	}

	private static int getDayOfWeek(int year, int month, int date) {
		// Date d = new Date(year -1900, month - 1, date);  
		// return d.getDay(); // 1(일)~7(토)
		Calendar c = new GregorianCalendar(year, month-1, date);
		return c.get(Calendar.DAY_OF_WEEK)-1;	// 1(일) ~ 7(토)
		
	}

}
