package days08;

import java.util.Arrays;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오전 10:12:33
 * @subject
 * @content	
 */
public class Ex02_01 {

	public static void main(String[] args) {
		
		// 두 기억공간의 값을 교환
		int [] m = {10, 20};
		
		System.out.println(Arrays.toString(m));
		
		// X swap(x,y) Call By Value
		
		swap(m);	// call By Reference
		
		System.out.println(Arrays.toString(m));
		
	}
	
	private static void swap(int[] m) {
		
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		
	}

	public static void swap(int num1, int num2) {
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
	}

}
