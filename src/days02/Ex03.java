package days02;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오전 10:49:19
 * @subject
 * @content	
 */

public class Ex03 {

	public static void main(String[] args) {
		// Alt + Shift + Y : 긴 문장 자동으로 밑으로 떨어뜨리는 단축키
		
		String name = "김진성";	// %s
		int age = 26;	// %d
		final double PI = 3.141592;	// %f
		char grade = 'A';	// %c
		
		System.out.printf("이름 : %s, 나이 : %d, PI : %f, 등급 : %c\n", name, age, PI, grade);
		
		/*
		 * [식별자 명명 규칙]
		 * 1. 자바는 대소문자 구분한다.
		 *  String name;
		 *  syso( Name ); X
		 * 2. 키워드(예약어)를 사용 X
		 *  int char; X
		 *  
		 * 3. $, _ 특수문자 사용 가능
		 *  int $age, _age O
		 * 
		 * 4. 숫자로 시작할 수 없다.
		 *  int 1kor; X
		 *  int kor1; 
		 */
		
		int kor1;
		// int 1kor; X
		
		int $age, a$ge;
		int _height, h_eight;
		// int #age; X
		
		// String first name;
		// String first_name;
		// String firstName; 권장
		
	} // class

} // main
