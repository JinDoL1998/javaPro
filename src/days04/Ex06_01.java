package days04;

import java.util.Iterator;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오후 4:02:25
 * @subject for문 사용해서 1~N(10) 까지의 합 출력
 * @content	
 */
public class Ex06_01 {

	public static void main(String[] args) {

		/*
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			if (i == 10) System.out.printf("%d ", i);
			else System.out.printf("%d + ", i);

			sum += i;

		}
		System.out.printf("= %d", sum);

		 */

		//		int sum = 0;
		//
		//		for (int i = 1; i <= 10; i++) {
		//
		//			System.out.printf( "i == 10 ? %d : %d + ", i);
		//
		//			sum += i;
		//
		//		}
		//		System.out.printf("= %d", sum);



		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("%d+ ", i);
			sum += i;

		}
		System.out.printf("\b= %d\n", sum);

	}

}
