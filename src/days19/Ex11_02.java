package days19;

import java.util.Date;

public class Ex11_02 {

	public static final String FONT_YELLOW = "\u001B[33m";
	public static final String RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		// 시험
		
		int year = 2024;
		int month = 2;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);
		
		Date start = new Date(year-1900, month-1, 1);
		start.setDate(start.getDate() - dayOfWeek);
		
		// System.out.println(start.toLocaleString());
		
		for(int i = 0; i < 42; i++) {
			// System.out.println(start.toLocaleString());
			if(start.getMonth() != month-1) {
				// System.out.printf("%02d\t", start.getDate());
				System.out.printf(FONT_YELLOW + "%02d\t" + RESET, start.getDate());
			} else {
				System.out.printf("%02d\t", start.getDate());
			}
			start.setDate(start.getDate() + 1);
			if(i % 7 == 6) System.out.println();
		}
		
	}
	
	private static int getLastDay(int year, int month) {
	      Date d = new Date(year -1900, month , 1 );
	      int date = d.getDate() - 1;
	      d.setDate(date); 
	      return d.getDate();	// 31
	   }

	   private static int getDayOfWeek(int year, int month, int date) {
	      Date d = new Date(year -1900, month - 1, date );  
	      return d.getDay(); // 0(일)~6(토)
	   }
}
