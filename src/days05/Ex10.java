package days05;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 4:51:47
 * @subject
 * @content	
 */
public class Ex10 {

	public static void main(String[] args) {
		
		/*
		int sum = 0;
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			System.out.printf(i == num ? "%d" : "%d + ", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		*/
		
		// 두 정수 n, m을 입력받아서 두 정수 사이의 합을 출력하는 코딩
/*		
		int sum = 0;
		int n, m;
		int maxNumber, minNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력 : ");
		n = scanner.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		m = scanner.nextInt();
		
		
		if(n > m) maxNumber = n;
		else minNumber = m;
		
		if(m > n) maxNumber = m;
		else minNumber = n;
		
		
		if (n > m) {
			maxNumber = n;
			minNumber = m;
		} else {
			maxNumber = m;
			minNumber = n;
		}
				
		for (int i = minNumber; i <= maxNumber; i++) {
			
			sum += i;
			
		}
		
		System.out.println("n, m 사이의 합 : " + sum);
	*/
		
		// 두 정수 n,m을 입력받아서 두 정수의 홀수의 합 출력
		
		int sum = 0;
		int n, m;
		int maxNumber, minNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		n = scanner.nextInt();
		System.out.print("두번째 정수 입력 : ");
		m = scanner.nextInt();
		
		if (n > m) {
			maxNumber = n;
			minNumber = m;
		} else {
			maxNumber = m;
			minNumber = n;
		}
		
		int maxOddNumber = 0;
		if (maxNumber % 2 == 0) maxOddNumber = maxNumber-1;
		
		for (int i = minNumber; i <= maxOddNumber; i++) {
			
			if(i % 2 == 0) continue;
					
			System.out.printf(i == maxOddNumber ? "%d" : "%d+", i);
			
			sum += i;
			
		}
		System.out.println();
		System.out.println("n, m 사이홀수의 합 : " + sum);
		
		
	}

}
