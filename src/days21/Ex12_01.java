package days21;

import java.util.Arrays;

public class Ex12_01 {

	public static void main(String[] args) {
		
		/*
		 * 1. ArrayList 컬렉션 클래스
		 * 	  1) Collection
		 * 			ㄴ List 인터페이스를 구현한 컬렉션 클래스이다
		 * 	  2) List인터페이스의 특징 : 순서유지O 중복허용X
		 * 	  3) Array(배열) + List(목록)
		 * 		 배열의 단점이 보완
		 * 		 요소(Element)
		 * 
		 */
		
		String[] names = new String[3];
		names[0] = "김진성";
		names[1] = "주강민";
		names[2] = "정하영";
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("정하영")) {
				System.out.println(names[i]); 
			}
		}
		
	Arrays.fill(names, null);
	System.out.println(Arrays.toString(names));
		
	}

}
