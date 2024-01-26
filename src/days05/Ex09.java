package days05;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 4:38:54
 * @subject continue 문
 * @content	
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// 홀수의 합 출력
		
		/* [1]
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			if (i % 2 != 0) {	
				sum += i;
				System.out.printf(i == 10 ? "%d" : "%d + ", i);
			}
		}
		System.out.printf(" = %d", sum);
		*/
		
		/* [2]
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) continue;
			
			sum += i;
			System.out.printf(i == 10 ? "%d" : "%d + ", i);
			
		}
		System.out.printf(" = %d", sum);
		*/
		
		int sum = 0;
		for(int i = 1; i <= 10; i+=2) {
			
			sum += i;
			System.out.printf(i == 10 ? "%d" : "%d + ", i);
			
		}
		System.out.printf(" = %d", sum);

		
	}

}
