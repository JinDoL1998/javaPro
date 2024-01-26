package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 2:43:32
 * @subject
 * @content	
 */
public class Ex04 {

	public static void main(String[] args) {

		for(int i = 'A', lineNumber = 1; i <= 'z'; i++) {

			if(i > 'Z' && i < 'a') continue;
			if(Character.isUpperCase(i)) {
				if(i % 10 == 5) System.out.printf("%d : ", lineNumber++);	
			}
			else {
				if(i % 10 == 1) System.out.printf("%d : ", lineNumber++);	
			}
						
			if(Character.isAlphabetic(i)) System.out.printf("%c(%03d)",i, i);
			
			
			if(Character.isUpperCase(i)) {
				if(i % 10 == 4) System.out.println();
			}else {
				if(i % 10 == 0) System.out.println();
			}

		}

	}

}
