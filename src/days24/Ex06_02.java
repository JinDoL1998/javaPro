package days24;

public class Ex06_02 {

	public static void main(String[] args) {
		
		// [ 제네릭의 제한 ]
		// 
		
	} // main

} // class

class Box2<T>{
	// Cannot make a static reference to the non-static type T
	// [제네릭의 첫 번째 제한]
	// 제네릭클래스에는 클래스 변수(정적필드) 선언할 수 없다.
	// static T item2;
	
	// [제네릭의 두 번째 제한]
	// 클래스 메서드 선언 + 매개변수 T 타입 사용
	// Cannot make a static reference to the non-static type T
	/*
	static int compare(T a, T b) {
		return 0;
	}
	*/
	
	// T타입의 배열은 선언할 수 있다.
	T [] itemArr;
	
	
}
