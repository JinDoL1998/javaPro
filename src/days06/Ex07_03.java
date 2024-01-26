package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 4:18:10
 * @subject
 * @content	
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
		// 구구단 세로 출력
		for(int i = 1; i <= 9; i++) {
			// System.out.printf("[%d단]", d);
			
			for(int d = 2; d <= 9; d++) {
				System.out.printf("%d X %d=%02d ", d, i, d*i);
				
				
			} // for i
			System.out.println();
		} // for d
		
		
	}// main

} //class
