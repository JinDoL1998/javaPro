package days06;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 12:41:17
 * @subject
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		char one;

		for(int i = 0; i < 2; i++) {
			System.out.print("> 한 문자 입력 ? ");
			one = scanner.next().charAt(0);
			System.out.printf("one = %c\n", one);
			one = scanner.next().charAt(0);
		}
	}

}
