package days05;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 4:26:09
 * @subject	foreach문 = 확장for문
 * @content	
 */
public class Ex08 {

	public static void main(String[] args) {
		
		int[] m = new int[10];
		
		// m 배열의 각 요소에 0 ~ 100사이의 임의의 정수를 채워넣자.
		// 0.0 <= (int)(Math.random() * 101) < 101
		
		for(int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random() * 101);
			System.out.println(i + "번째 : " + m[i]);
		}
		
		/*
		for (자료형 변수명 : 배열 또는 컬렉션) {
			
		}
		*/
		
		int sum = 0;
		for(int i : m) {
			System.out.printf("[%d]", i);
			sum += i;
		}
		System.out.printf(" 합 : %d", sum);
		
		// m 배열을 출력하는 코딩.
//		for(int i = 0; i < m.length; i++) {
//			System.out.println(i + "번째 : " + m[i]);
//		}
		
	}

}
