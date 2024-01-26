package days06;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 3:56:13
 * @subject
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {

		String engName;

		Scanner scanner = new Scanner(System.in);

		System.out.print("영어이름 입력 : ");
		engName = scanner.nextLine();	// kim jin seong

		int arrayLength = engName.length();

		char[] engNameCharArray = new char[arrayLength]; 

		for (int i = 0; i < arrayLength; i++) {
			engNameCharArray[i] = engName.charAt(i);

			System.out.printf("%c", engNameCharArray[i]);
		}
		
		System.out.println();
		for (char c : engNameCharArray) {

			System.out.printf("'%c' ", c);
		}
		

		
		scanner.close();
	}

}
