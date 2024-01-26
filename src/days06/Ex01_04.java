package days06;

import java.util.Scanner;

public class Ex01_04 {

	public static void main(String[] args) {

		int a, b, c;

		int maxNumber = 0, minNumber = 0;

		try (Scanner scanner = new Scanner(System.in);) {

			System.out.print("정수 a,b,c 입력 : ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			maxNumber = Math.max(a, b);
			maxNumber = Math.max(maxNumber, c);
			
			minNumber = Math.min(a, b);
			minNumber = Math.min(minNumber, c);
			
			// double Math.pow(3,2); => 3의 제곱


		} catch (Exception e) {

		}

		System.out.printf("가장 큰수 : %d, 가장 작은 수 : %d",maxNumber, minNumber);


	}

}


