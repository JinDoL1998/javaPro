package days21;

import java.time.LocalDate;

public class Ex05 {

	public static void main(String[] args) {
		
		// 날짜, 시간의 비교 isAfter(), isBefore(), isEqual()
		// 생일 : 1999.1.20
		// 올해 생일이 지났는지? 지나지 않았는지? 오늘인지 체크
		
		LocalDate birth = LocalDate.of(1999, 1, 20);
		LocalDate today = LocalDate.now();
		
		birth = birth.withYear(today.getYear());
		System.out.println(today.isAfter(birth));	// >
		System.out.println(today.isBefore(birth));	// <
		System.out.println(today.isEqual(birth));	// ==
		
		// 0, 양수, 음수
		System.out.println(today.compareTo(birth));	// 9(양수)
		
		
		
		
		
		
		
	}

}
