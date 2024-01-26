package days19;

import java.util.Date;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 날짜, 시간, 형식화(formatting)클래스
		 * 2. 컬렉션 프레임워크( 컬렉션 클래스 )
		 * 3. 자바 IO(입출력)
		 * 4. 열거형, 제네릭
		 * 
		 * 5. 스레드 + 네트워크 x
		 * 6. 람다식 + 스트림 x
		 * 
		 */
		
		// jdk 1.0		java.util.Date
		// jdk 1.1		java.util.Calendar
		//						  ㄴ GregorianCalendar
		// jdk 1.8		java.time 패키지 + 하위 패키지
		//				다양한 날짜/시간 클래스 추가
		Date date = new Date();
		// Thu Jan 25 16:37:33 KST 2024
		System.out.println(date.toString());
		System.out.println(date);
		System.out.println(date.toGMTString());
		// 2024. 1. 25. 오후 4:41:07
		System.out.println(date.toLocaleString());
		System.out.println();
		
		// 년
		System.out.println(date.getYear() + 1900);
		// 월
		System.out.println(date.getMonth() + 1);
		// 일
		System.out.println(date.getDate());
		// 시간
		System.out.println(date.getHours());
		// 분
		System.out.println(date.getMinutes());
		// 초
		System.out.println(date.getSeconds());
		// 밀리초	1000ms = 1s
		// 요일
		System.out.println(date.getDay());	// 0(일) ~ 6(토)
		System.out.println("알월화수목금토".charAt(date.getDay()));	// 0(일) ~ 6(토)
		
		// long d.getTime()
		// 1970.1.1 - 00.00.00.000 ~ 
		System.out.println(date.getTime()); // 1706168796737
		
		long time = date.getTime();
		
		Date date2 = new Date(time);
		System.out.println(date2);
		
		
	} // main

} // class
