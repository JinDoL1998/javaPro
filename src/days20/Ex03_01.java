package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03_01 {

	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar(2024, 1-1, 1);
		System.out.println(Ex02.getFormatDate(c, "yyyy MM dd"));
		c.getActualMaximum(Calendar.DATE);
		
		// c.add(Calendar.MONTH, 1);
		// c.add(Calendar.DATE, -1);
		
		
	}

}
