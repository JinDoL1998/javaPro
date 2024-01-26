package days04;

public class Ex06_02 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		for ( ; ; ) {
			sum += i;
			if(i > 10) break;
			System.out.print(i++ + "+");
		}
		// Unreachable code
		System.out.printf("1~10 합 : %d", sum);
		
	}
	
}
