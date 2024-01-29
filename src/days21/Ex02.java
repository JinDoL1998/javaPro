package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex02 {

	public static void main(String[] args) {
		
		// [1. time 핵심 클래스]
		// now() 메서드
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString()); 	// 2024-01-29
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); 	// 10:26:26.716117400
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); 	// 2024-01-29T10:27:38.908792200
		
		// of() 메서드
		ld = LocalDate.of(2023, 12, 29);
		System.out.println(ld);
		
		lt = LocalTime.of(14, 20, 11);
		System.out.println(lt);
		
		ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		
		
		
		
	}

}
