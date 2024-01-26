package days02;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오전 11:22:46
 * @subject 자바 자료형
 * @content	-String(%s), double(%f), char(%c), int(%d)
 */

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * [자료형] == Data Type(데이터 형식)
		 * 1. Data(값) + Type(종류)
		 * 2. 자료형 : 값이 저장될 공간의 크기와 저장형식을 정의한 것
		 * 3. 자바형
		 *    1) 기본형(Primitive Type) - 8가지의 기본형
		 *    	(1) 숫자형
		 *    		ㄱ. 정수계열 - byte(1byte), short(2byte), [int(4byte)], long(8byte)
		 *    			문자자료형				char(2byte)	
		 *    		  	1byte = 8bit
		 *    		  	1bit = [0] [1]
		 *    		  
		 *    			byte 정수 표현 범위 : 2^8 == -128 ~ 127
		 *    			short 정수 표현 범위 : 2^16 == -32768 ~ 32767
		 *    			int 정수 표현 범위 : 2^32 == -2,147,483,648 ~ 2,147,483,647
		 *    			long 정수 표현 범위 : 2^64 == -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 *    		ㄴ. 실수계열 - float(4byte), [double(8byte)]
		 *    	(2) 논리형(boolean, 1byte) - 참(true), 거짓(false)
		 *    2) 참조형(Reference Type) - 배열(Array), 클래스, 인터페이스
		 */
		
		// 성별을 나타내는 변수 선언 : 남자(true), 여자(false)
		boolean gender = true;
		System.out.printf("성별 : %b \n", gender);
		
		// 사람의 나이를 저장할 변수 선언
		short age;
		
		// 한 학생의 국어 점수를 저장할 변수 kor선언
		byte kor;
		
	}

}
