package days04;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오후 4:52:45
 * @subject	분기문(switch)
 * @content	
 */
public class Ex07 {

	public static void main(String[] args) {

		/*
		key 	: 변수, 수식
		value	: 리터럴(정수, 문자, 문자열), 변수X
		switch (key) {
		case value:

			break;
		case value:

			break;
		case value:

			break;

		[default:
			break;]
		}
		 */

		int n;
		
		final int ZERO = 0;

		try(Scanner scanner = new Scanner(System.in);) {

			System.out.print("정수 n 입력 : ");
			n = scanner.nextInt();

			switch (n % 2) {
			case ZERO:
				System.out.println("짝수(even number");
				break;
			
			case 1:
				System.out.println("홀수(odd number)");
				break;
			}
			
		} catch (Exception e) {

		}

	}

}
