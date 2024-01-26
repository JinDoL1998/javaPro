package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 4:18:10
 * @subject
 * @content	
 */
public class Ex07 {

	public static void main(String[] args) {
		
		/* 구구단 = multiplication table
		 * 2단  = [2nd level] ,2times table
		 */
		
		/*
		 * 이중 for문
		 * d=2
		 * 2단
		 * 	ㄴ i=1,2,3,4,5,6,7,8,9	i=10
		 * 
		 * d=3
		 * 3단
		 * 	ㄴ i=1,2,3,4,5,6,7,8,9	i=10
		 * 
		 * d=9
		 * 9단
		 * 	ㄴ i=1,2,3,4,5,6,7,8,9 i=10
		 */
		
		for(int d = 2; d <= 9; d++) {
			System.out.printf("%d단\n", d);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", d, i, d*i);
			}
		}
		
		
	}

}
