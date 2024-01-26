package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 4:18:10
 * @subject
 * @content	
 */
public class Ex07_01 {

	public static void main(String[] args) {
		
		int d = 2;
		int i = 1;
		
		while (d <= 9) {
			System.out.printf("%d단\n", d);
			i = 1;
			while (i <= 9) {
				
				System.out.printf("%d X %d = %d\n", d, i, d*i );
				i++;
			} // while i
			
			d++;
		} // while d
		
		/*
		for(int d = 2; d <= 9; d++) {
			System.out.printf("%d단\n", d);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", d, i, d*i);
			}//for i
		}//for d
		*/
		
	}// main

} //class
