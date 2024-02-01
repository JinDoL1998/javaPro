package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * [제네릭Generics)]
		 * 1. jdk1.5 - 제네릭
		 * 	  jdk1.8 - 람다식
		 * 
		 * 2. 제네릭?
		 *  다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에서 컴파일시에 타입을 체크해 주는 기능.
		 *  
		 * 3. 왜 ? 객체의 타입을 컴파일시에 체크하는 이유
		 * 	  1) 객체의 타입 안전성을 높인다.
		 * 	  2) 형 변환의 번거로움이 줄어든다. -> 코드가 간결해진다.
		 *   (제넥릭의 장점)
		 *   
		 *   
		 */
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add('A');
		list.add("홍길동");
		list.add(true);
		list.add(new MemberVO());
		
		// ArrayList 컬렉션 클래스 안에 있는 자료형 형변환
		int i = (int)list.get(0);
		double d = (double)list.get(1);
		char c = (char)list.get(2);
		String s = (String)list.get(3);
		MemberVO vo = (MemberVO)list.get(4);
		
		// 제네릭 + 클래스 = 제네릭 클래스
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add("김길동");
		list2.add("박길동");
		
		// 첫 번째 장점 - 타입 안정성
		// 컴파일러가 타입 체크 : list2.add(100);
		
		// 두 번째 장점 - 형변환 필요 없다.(코드간결성)
		String name = list2.get(0);
		name = list2.get(1);
		name = list2.get(2);
		
		Iterator<String> ir = list2.iterator();
		while (ir.hasNext()) {
			name = ir.next();	// 형변환 필요X	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
