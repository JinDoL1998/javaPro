package days10;

import java.util.Calendar;

public class Ex02_01 {

	public static void main(String[] args) {
		
		int year = 2020;
		int month = 5;
		
		int lastDay = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		
	}

}
