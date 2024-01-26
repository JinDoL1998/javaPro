package days05;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 2:42:17
 * @subject if, switch, for, break
 * @content	while 조건반복문
 */
public class Ex07 {

	public static void main(String[] args) {

		/*
		while (condition) {
			명령 코딩
		}
		 */

		// 예) 1 ~ 10 55

		/* [1]
		int num = 1, sum = 0;

		while(num <= 10) {
			System.out.printf("\b%d+ ", num);
			sum += num;
			num++;
		}
		System.out.printf("=%d\n", sum);
		 */

		/* [2]
		int i = 0, sum = 0;
	      while ( i < 10 ) {  
	         i++;  
	         System.out.printf("%d+", i); 
	         sum += i;  

	      } // while
	      System.out.printf("=%d\n", sum);
		 */

		/* [3]
		int i = 0, sum = 0;
		//while ( i++ <= 10 ) {
		while ( ++i <= 10 ) {
			System.out.printf("%d+", i); 
			sum += i;   

		} // while
		System.out.printf("=%d\n", sum);
		*/
		
		/* [4]
		int num = 10, sum = 0;

		while(num >= 1) {
			System.out.printf("\b%d+ ", num);
			sum += num;
			num--;
		}
		System.out.printf("=%d\n", sum);
		*/
		
		int num = 10, sum = 0;

		while(true) {
			if(num < 1) break;
			
			System.out.printf("\b%d+ ", num);
			sum += num;
			num--;
		}
		System.out.printf("=%d\n", sum);
	}

}
