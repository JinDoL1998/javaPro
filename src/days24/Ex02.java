package days24;

import java.util.ArrayList;
import static java.util.Collections.*;

public class Ex02 {

	public static void main(String[] args) {
		
		// Arrays 클래스 : 배열 사용하기 쉽도록 기능(메서드)
		// 				   이 구현된 클래스
		// [ Collections 클래스 ]
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		// <? super T> 매개변수 다형성
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		/*
		// rotate() : distance 만큼 오른쪽으로 이동
		int distance = -2;	// 음수면 왼쪽으로 이동
		Collections.rotate(list, distance);
		System.out.println(list);
		*/
		
		/*
		Collections.swap(list, 0, 3);
		System.out.println(list);
		*/
		
		/*
		// shuffle() : 임의의 자리변경
		shuffle(list);
		System.out.println(list);
		 */
		
		shuffle(list);
		System.out.println(list);
		// 오름차순 정렬
		sort(list);
		System.out.println(list);
		
		// 내림차순 정렬		
		// sort(list, (o1, o2) -> o2 - o1);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		fill(list, 1000);
		System.out.println(list);
		
		
		
	} // main

}
