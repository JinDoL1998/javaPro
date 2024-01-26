package days07;

import java.util.Scanner;

public class Ex03_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int line;
		int lineStar;

		System.out.print("행의 갯수를 입력하세요 ? ");
		line = scanner.nextInt();
		lineStar = line * 2 - 1; 
		// 5 -> 9
		// 4 -> 7
		// 3 -> 5

		for(int i = 1, lineNumber = 1; i <= line; i++) {
			System.out.printf("%d : ", lineNumber++);
			for(int j = 1 ; j < lineStar + 1; j++) {

//				if((j <= line - i) || (j >= line + i)) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
				
				System.out.print(i + j>=line + 1 && j-i<=line - 1 ? "*" : "_");


			}
			System.out.println();
		}

		scanner.close();

	}

}
