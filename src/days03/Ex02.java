package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오전 11:19:44
 * @subject
 * @content	
 */

public class Ex02 {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE; 	// 100;
		int j = 100;
		
		// int k = i + j;	// 산술 오버플로워(overflow) 발생
		long k =  (long)i + j;
		
		System.out.printf("%d + %d = %d\n", i, j, k);
		
		
		
	}

}
