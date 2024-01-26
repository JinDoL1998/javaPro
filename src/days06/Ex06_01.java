package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 3:56:13
 * @subject
 * @content	
 */
public class Ex06_01 {

	public static void main(String[] args) {

		String engName;

		Scanner scanner = new Scanner(System.in);

		System.out.print("영어이름 입력 : ");
		engName = scanner.nextLine();	// kim jin seong
		System.out.printf("name : %s\n", engName);
		
		// String.toCharArray()
		// 1) String -> char[] 변환하는 함수(메서드)
		char[] nameCharArray = engName.toCharArray();

		// 배열안의 값을 확인하는 용도로 Arrays.toString()메서드 사용
		// [k, i, m, , j, i, n, , s, e, o, n, g]
		System.out.println( Arrays.toString(nameCharArray));
		
		// 2) char[] -> String변환하는 방법 : String.valueOf() 메서드
		engName = String.valueOf(nameCharArray);
		System.out.printf("name : %s\n", engName);
		
		

		
		scanner.close();
	}

}
