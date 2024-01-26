package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// Calendar 클래스
		// jdk 1.1 Calendar 추상클래스 - 날짜 시간
		// Calendar c = new Calendar(); X
		Calendar c = Calendar.getInstance();
		//	 ㄴ new GregorianCalendar();
		// System.out.println(c.toString());
		
		// 2024년도의 몇일 쨰?
		System.out.println(c.get(Calendar.DAY_OF_YEAR));	// 26
		// 해당 주의 몇일 째?
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); 	// 6
		// 년 중의 몇 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); 	// 4
		// 해당 달의 몇 주
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); 	// 4
		
		// 년
		System.out.println(c.get(1));	// 2024
		System.out.println(c.get(Calendar.YEAR));	// 2024
		
		// 월
		System.out.println(c.get(2) + 1);	// 1
		System.out.println(c.get(Calendar.MONTH) + 1);	// 1
		
		// 일
		System.out.println(c.get(5));	
		System.out.println(c.get(Calendar.DATE));	
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	
		
		// 시간
		System.out.println(c.get(10));	
		System.out.println(c.get(Calendar.HOUR));			// 12(0~11)
		System.out.println(c.get(11));	
		System.out.println(c.get(Calendar.HOUR_OF_DAY));	// 24
		
		// 분
		System.out.println(c.get(12));	
		System.out.println(c.get(Calendar.MINUTE));
		
		// 초
		System.out.println(c.get(13));	
		System.out.println(c.get(Calendar.SECOND));
		
		// 밀리초
		System.out.println(c.get(14));	
		System.out.println(c.get(Calendar.MILLISECOND));
		
		// 요일
		// Date		0(일) 1(월) ...		6(토)
		// Calendar 1(일) 2(월) ... 	7(토)
		System.out.println(c.get(7));	
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("-".repeat(30));
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.PM));
		// 오전인지 오후인지 AM = 0 PM = 1
		System.out.println(c.get(Calendar.AM_PM));

		
	} // main

}
