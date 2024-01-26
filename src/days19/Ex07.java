package days19;

import days15.Person;
import days15.Point;

public class Ex07 {

	public static void main(String[] args) {
		
		// [ 자동auto boxing / unboxing ]
		// 기본형 => 래퍼클래스
		int i = 100;
		// 오토 박싱
		Integer j = i;	// j 객체  <-- i 기본형
		// JDK 1.5 Integer j = new Integer(i);
		
		// j 객체 --> k기본형 변환 (오토 언박싱)
		int k = j;
		
		
		test(new Person());
		test(new Point());
		
		test(1);		// int -> 오토박싱 Integer -> Object
		test(true);		// boolean
		test(3.14);		// double
		test('a');		// char
		test("string");	// String	0 up casting
		
	} // main
	
	
	public static Object test(Object o) {	// upcasting
		
		return null;
	}
	

}
