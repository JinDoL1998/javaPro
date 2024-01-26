package days06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int a, b, c;
		
		int maxNumber = 0, minNumber = 0;
			
		try (Scanner scanner = new Scanner(System.in);) {
				
			System.out.print("정수 a,b,c 입력 : ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
				
			if(a > b) {
				if(a > c) {
					maxNumber = a;
					minNumber = c;
				}
				else {
					
				}
			}
			
						
		} catch (Exception e) {
				
		}
			
		System.out.printf("가장 큰수 : %d, 가장 작은 수 : %d",maxNumber, minNumber);


	}

}


