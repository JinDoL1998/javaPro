package days02;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오전 10:28:23
 * @subject 두 기억공간의 값을 바꾸기(암기)
 * @content	
 */

public class Ex02_02 {

	public static void main(String[] args) {
		
		/*
		int x = 10;
		int y = 20;
		*/
		
		// 콤마(,) 연산자
		int x = 10, y = 20;
		
		/*
		 int a = 100;
		 int b = 100;
		 int c = 100;
		 */
		
		// int a = 100, b = 100, c = 100;
		
		/*
		int a, b, c;
		// 		  ←
		a = b = c = 100;
		*/
		
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		
		// [작업]
		// 프로그램 상에서 두 기억공간의 값을 교환하려면
		// 반드시 동일한 자료형의 임시기억공간이 필요하다.
		
		{
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);
		
	} // main

} // class
