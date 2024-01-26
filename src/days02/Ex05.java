package days02;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오후 12:15:57
 * @subject 변수(variable), 상수(constant), 리터럴(literal) 설명
 * @content	
 */

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * 변수 :
		 * 상수 : final 키워드 선언
		 * 리터럴(literal) : 그 자체가 값을 의미하는 것
		 * 					true, false, 100, 'A', 3.14 등등
		 */
		
		// 리터럴과 접미사
		/*
		 * int    형 0  [00000000] [00000000] [00000000] [00000000]
		 * long   형 0  [00000000] [00000000] [00000000] [00000000] [00000000] [00000000] [00000000] [00000000]
		 * float  형 0
		 * double 형 0 
		 */
		
		int i = 0;		// [][][][]
		long j = 0L;	// [][][][][][][][]
		// Type mismatch: cannot convert from double to long
		// long k = 0D; double 0
		// 0F float 0
		
		// Type mismatch: cannot convert from double to float
		float f = 3.14F;
		
		// long z = 10.;
		
	} // main

} // class
