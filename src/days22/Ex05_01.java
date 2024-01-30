package days22;

import java.util.LinkedList;

public class Ex05_01 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");		
		System.out.println(list);
		list.addFirst("김진성");
		System.out.println(list);
		
		// list.size();
		
		list.contains("홍길동");	// false
		list.indexOf("홍길동");		// -1
		list.lastIndexOf("홍길동");	// -1
		
		// 이지현을 찾아서  "고경림"으로 이름을 수정
		int indexNumber = -1;
		if((indexNumber = list.indexOf("이지현")) != -1) list.set(indexNumber, "고경림");
		System.out.println(list);
		
		// 				 읽기		(임의)삽입/삭제		비고
		// ArrayList	빠르다		 느리다				순차적으로 추가,삭제 빠르다
		// LinkedList	느리다		 빠르다				데이터 많으면 많을수록 접근성은 떨어진다.
			
		
	} // main

} // class
