package days06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x, y;
		int maxNumber = 0, minNumber = 0;
		int sum = 0;

		System.out.print("정수 x 입력 : ");
		x = scanner.nextInt();

		System.out.print("정수 y 입력 : ");
		y = scanner.nextInt();
		
		maxNumber = Math.max(x, y);
		minNumber = Math.min(x, y);
		/* [1]
		for(int i = minNumber; i <= maxNumber; i++) {

			if(i % 2 != 0) continue;
			sum += i;
			System.out.printf("%d ", i);

		}
		*/
		
		if( minNumber % 2 == 0) minNumber++;
		
		for(int i = minNumber; i <= maxNumber; i+=2) {
			sum += i;
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		System.out.println("x, y사이 짝수의 합 : " + sum);
		
		scanner.close();

	}

}
