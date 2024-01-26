package days08;

public class Ex04_02 {

	public static void main(String[] args) {
		
		// 재귀함수예제
		// 팩토리얼( factorial ) == 계승
		// 정의) 1에서 양의 정수의 곱
		// n! = n * (n-1) * (n-2) * (n-3) ...
		// 0! == 1(약속)
		
		int n = 0;
//		int result = factorial(n);
		int result = recursiveFactorial(n);
		
		System.out.println("=" + result);
		
		
		
	}
	
	// 재귀 함수
	private static int recursiveFactorial(int n) {
		if (n == 0 || n == 1) return 1;
		
		else return n * recursiveFactorial(n - 1);
	}



	private static int factorial(int n) {
		
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result *= i;
		}
		
		return result;
	}

}
