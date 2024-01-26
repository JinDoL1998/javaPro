package days01;

/**
 * @author jinseong
 * @date 2023. 12. 29. - 오후 4:04:46
 * @subject
 * @content 이름, 나이를 저장할 변수를 선언하고
 * 			출력하는 코딩.	
 */

public class Ex04 {

	public static void main(String[] args) {
		
		// 1. 이름을 저장할 변수 선언
		String name;
		name = "이동영";
		
		// 2. 나이를 저장할 변수 선언
		int age;
		age=26;
		
		// 3. 이름/나이 출력
		// 3-1. 출력형식 :	이름은 " "이고, 나이는 " "이다.
		// String literal is not properly closed by a double-quote
		System.out.println("이름은 \"" + 
							name+ "\"이고 나이는 \"" + 
							age + "\"살이다.");
		
		
	}
}
