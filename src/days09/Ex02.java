package days09;

import com.util.Mycalendar;

public class Ex02 {

	public static void main(String[] args) {
		
		//Mycalendar.isLeapYear(year);
		String result = "평년";
		
		for(int i = 2010; i <= 2030; i++) {
			result = "평년";
			if(Mycalendar.isLeapYear(i)) result = "윤년";
			System.out.printf("%d년 %s\n", i, result);
		}
		
	}

}
