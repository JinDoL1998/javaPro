package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오후 12:48:25
 * @subject [논리연산자]
 * @content	boolean 참/거짓
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
		/*
		 * 1. 일반 논리 연산자
		 * 	1) &&	일반 논리 AND 연산자(논리곱)
		 * 		피연산자 && 피연산자
		 * 		true	 && true	true
		 * 		true	 && false	false
		 * 		false	 && true	false
		 * 		false	 && false	false
		 * 		두 피연산자 참일 때만 참이된다
		 */
		System.out.println( 3 >= 5 );	// false
		System.out.println( 10 >= 5 );	// true
		System.out.println( 3 >= 5 && 10 >= 5 );	// false
		System.out.println( 3 <= 5 && 10 >= 5 );	// true
		
		
		
		/* 	2) ||	일반 논리 OR 연산자(논리합)
		 * 		항 || 항
		 * 	  true || true  true
		 * 	  true || true  true
		 * 	  true || true  true
		 * 	 false || false false
		 *
		 */
		 
		System.out.println( 3 > 4 || 4 > 1);	// true
		System.out.println( 3 <= 4 || 4 > 1);	// true
		System.out.println( 3 <= 4 || 4 < 1);	// true
		System.out.println( 3 >= 4 || 4 < 1); 	// false
		
		
		/* 	3) ! 부정(NOT) 연산자
		 * 		!참 -> 거짓
		 * 		!거짓 -> 참
		 */ 
		
		System.out.println(true);
		System.out.println(!true); // false
		System.out.println(false);
		// The operator ! is undefined for the argument type(s) int
		
		// 우선순위 >=	<	!
		System.out.println(!(3 >= 4)); // true
	
		
		/* 
		 * 2. 비트 논리 연산자
		 * 	1) & 비트 논리 AND 연산자
		 * 	2) | 비트 논리 OR 연산자
		 * 	3) ^ XOR 연산자
		 * 	4) ~ 틸드 연산자 (비트부정연산자)
		 * 
		 */
		
		
		
		
		
		
	}

}
