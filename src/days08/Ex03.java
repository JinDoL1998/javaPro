package days08;

import java.util.Scanner;

import com.util.Mycalendar;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오전 10:47:23
 * @subject
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) {

		// 년도를 입력받아서 윤년/평년 출력 코딩

		int year;
		year = getYear();

		if ( Mycalendar.isLeapYear(year)  ) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		}


		/*
		String result = Mycalendar.isLeapYear(year);
		if(Mycalendar.isLeapYear(year).equals("윤년")) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		 */


		/*
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
			System.out.println("윤년(leap year)");
		else System.out.println("평년(common year)");
		 */
	}

	private static int getYear() {

		int year;
		System.out.print("> 년도 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		// String regex = "\\d*[1-9]";
		year = scanner.nextInt();

		return year;
	}

}
