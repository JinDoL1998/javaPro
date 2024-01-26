package days15;

import java.util.Date;

import days14.Point;

/**
 * @author jinseong
 * @date 2024. 1. 19. - 오후 12:02:57
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 어제 했던 코딩을 생성자 사용해서 수정.
		// 클래스 배열 초기화
		/*
		Point [] points = {
				new Point(1,1),
				new Point(10,10),
				new Point(20,20)
		};
		*/
		
		int year = 2024;
		int month = 1;
		int day = 19;
		
		// Date, Calendar , LocalDate
		Date d = new Date(year - 1900, month - 1, day);
		System.out.println(  d.toString() );
		System.out.println(  d.toGMTString() );
		System.out.println(  d.toLocaleString() );
		
		System.out.println(  d.getDay() ); // 5(금) 0(일)~6(토)

	} // main

} // class
