package days08;

import java.util.Random;

public class Ex05_05 {

	public static void main(String[] args) {
		
		new Random()
				.ints(1,46)		// 1~45 정수
				.distinct()		// 중복제거
				.limit(6)		// 6개
				.sorted()		// 오름차순정렬
				.forEach(System.out::println);	// 메서드참조
				// .forEach(n->System.out.println(n));
		
		// -> : 람다연산자
		
	}

}
