package days05;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 2:00:54
 * @subject	ASCII 256가지 출력
 * @content	0~31 제어문자
 * 			32 ~ 127 일반문자(숫자, 대소문자 등)
 * 			128 ~ 사선 문자...
 * 			문제1) 한 라인에 10개씩 출력
 */
public class Ex06 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 256; i++) {
			// System.out.printf("%d-%c\n",i , i);
			System.out.printf("[%c]", (char)i);
			
			if( (i % 10) == 9 ) System.out.println();
		}
		
	} //main

} //class
