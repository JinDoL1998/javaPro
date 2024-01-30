package days22;

import java.time.LocalDateTime;

public class Ex01 {

	public static void main(String[] args) {

		LocalDateTime startDate = LocalDateTime.of(2023, 8, 10, 9, 0);
		LocalDateTime endDate = LocalDateTime.of(2023, 8, 15, 18, 0);
		LocalDateTime now = LocalDateTime.now();
		
		if((now.isAfter(endDate) || now.isBefore(startDate)))
			System.out.println("불가능");
		else
			System.out.println("가능");
		
		
		
		
		
	}

}
