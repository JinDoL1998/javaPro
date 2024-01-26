package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오전 10:38:34
 * @subject [ 형변환 설명 ]
 * @content	
 */

public class Ex01_01 {

	public static void main(String[] args) {
		
		/*
		 * [형변환]
		 * 1. 정의 ? 변수 또는 상수의 자료형(타입)을 
		 * 			다른 자료형(타입)으로 변환하는 것
		 *  
		 *  2. 형변환 하는 방법
		 *  1) 자동 형변환 - 2가지
		 *  	
		 *  2) 강제 형변환
		 *  	ㄱ. 경우
		 *  	ㄴ. 방법
		 *  		(변환하고자하는 자료형) cast 연산자
		 *  		cast 강제 형변환
		 *  
		 *  		
		 *
		 */
		
		byte b = 100;	// [0][1][1][0] [0][1][0][0] 8bit
		// 자동형변환 첫번째 경우
		// 좌측의 있는 항이 더 크면 자동 형변환
		long l = b;
		System.out.println(l);
		
		double d = b;
		System.out.println(d);
		
		// 실수계열이 정수계열보다 더 크다고 인식함
		float f = l;
		System.out.println(f);
		
		// int i = 100L : 자동형변환 x
		// Type mismatch: cannot convert from double to float
		// float f2 = 3.14; 
		float f2 = 3.14F;
		
		int x = 100;
		long y = 100;
		// Type mismatch: cannot convert from long to int
		// 작은자료형 연산 큰자료형 => 자동 큰자료형
		long z = x + y;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
