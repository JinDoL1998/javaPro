package days21;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12 {

	public static void main(String[] args) {

		// [ArrayList 컬렉션 클래스]
		// <E> 제네렉
		ArrayList list = new ArrayList(3);
		list.add("김진성");
		list.add("정하영");
		list.add("주강민");

		// System.out.println(list);
		// System.out.println(list.size());

		list.add("홍길동");
		// System.out.println(list);

		System.out.println(list.contains("정하영"));
		System.out.println(list.contains("정하영"));

		// [김진성, 정하영, 홍길동, 김하정]
		list.add(2, "권맑음");
		System.out.println(2);

		int index = -1;
		index = list.indexOf("정하영");
		if(index != -1) {

			list.remove(index);
		}
		// System.out.println(list);

		
		index = list.indexOf("주강민");
		
		if(index != -1) {
			list.set(index, "주강미");
		}
		// System.out.println(list);
		
		/*
		System.out.println(list.isEmpty());	// false
		list.clear();	// 모든 요소를 제거
		System.out.println(list.isEmpty()); // true
		*/
		
		// 모든 요소를 출력할 때
		// get(index)
		/*
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		*/
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-".repeat(30));
		// 요소를 출력(가져올 때는) iterator 반복자
		// 요소를 순차적으로 처리할 수 있는 반복자: iterator
		Iterator ir = list.iterator();
		while (ir.hasNext()) {	// hasNext() 요소를 가지고 있니? true, false
			Object name = (String) ir.next();	// next() 요소를 얻어온다.
			System.out.println(name);
			
		}
		
		// ArrayList 메서드
		// 1) add()
		// 2) contains()
		// 3) size()
		// 4) get()
		// 5) set()
		// 6) indexOf()
		// 7) remove()
		// 8) clear()
		// 9) iterator()
		// 10) isEmpty()
		// 11) ir.hasNext() / next()
		
		
		
	} // main



}
