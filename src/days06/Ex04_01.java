package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 2:43:32
 * @subject
 * @content	
 */
public class Ex04_01 {

	public static void main(String[] args) {

		for (int i = 'A', count = 1, lineNumber = 1; i <= 'z' ; i++) { 
			
			if( Character.isAlphabetic(i) ) {

				if( count % 10 == 1) System.out.printf("%d : ", lineNumber++);

				System.out.printf("%c(%03d)", (char)i, i ); 

				if( count % 10 == 0) System.out.println();

				count++;

			} // if

		} // 


	}

}
