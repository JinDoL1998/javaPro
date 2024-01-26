package days06;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 12:41:17
 * @subject
 * @content	
 */
public class Ex03_01 {

	public static void main(String[] args) {
		
		char one ;
		// Syntax error on token "continue", invalid VariableDeclaratorId
		// 예약어를 식별자로 사용할 수 없기때문에
		char con = 'y';
		
		// 2:00 수업 시작~ 
		
		Scanner scanner = new Scanner(System.in);		
		
		do {
			System.out.print("> 한 문자 입력 ? ");
			one = scanner.next().charAt(0);  // "a"
			System.out.printf("one='%c'\n", one);
			
			System.out.print("\n\n 계속할거냐? ");
			con = scanner.next().charAt(0); //  'y'  'n'
		} while ( con == 'y' || con == 'Y');

		System.out.println("end");
			
	}		
		
}

