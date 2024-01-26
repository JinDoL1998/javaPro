package days07;

public class Ex10 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		// 두 정수 a,b의 합을 구해서 출력.
		// 두 정수의 합을 구해서 반환하는 메서드(함수) 선언 + 호출
		// c = a + b;
		c = sum(a, b);
		System.out.printf("%d + %d = %d\n", a, b, sum(a, b));
		
		System.out.printf("%d\n", sum(a,b,c));
		
		
	} // class

	// 함수(메서드) 선언
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
} // class
