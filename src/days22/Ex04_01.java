package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Ex04_01 {

	public static void main(String[] args) {
		
		// Vector 컬렉션 클래스 
		//	ㄴ List 인터페이스
		// 	ㄴ 순서 유지 O, 중복 허용 O
		//	ㄴ ArrayList 동일 
		// 		차이점 : 멀티 스레드 안전( 동기화 처리 O )
		
		// StringBuffer		멀티 스레드 안전O ( 동기화 처리 O )
		// StringBuilder	멀티 스레드 안전X ( 동기화 처리 X )
		
		// Vector v = new Vector(10, 0);
		Vector v = new Vector();
		v.addElement("강명건");
		v.add("박우현");
		v.add("김영진");
		
		// Arrays 동일, 멀티스레드 안전(동기화처리O)
		
		// Iterator iterator() 반복자
		// ListIterator listIterator()	설명...
		//	ㄴ 양방향으로 조회 기능이 추가된 반복자
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
			
		}
		System.out.println("-".repeat(30));
		
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
			
		}
		
		
	}

}
