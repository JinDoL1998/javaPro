package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03_02 {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		//String t = Ex04.getFormatDate(today, "yyyy-MM-dd HH:mm:ss.SSS");      
		//t = t.substring(0, 10); // yyyy-MM-dd

		Calendar start = new GregorianCalendar(2024, 1-1, 26);
		//String s = Ex04.getFormatDate(start, "yyyy-MM-dd HH:mm:ss.SSS");
		//s = s.substring(0, 10);

		//System.out.println( t.equals(s));

		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);

		System.out.println( Ex02.getFormatDate(today, "yyyy-MM-dd HH:mm:ss.SSS") );
		System.out.println( Ex02.getFormatDate(start, "yyyy-MM-dd HH:mm:ss.SSS") );

		System.out.println( today.compareTo(start)   );
		System.out.println( today.equals(start)   );


	}

}
