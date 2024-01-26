package days05;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오후 12:36:14
 * @subject
 * @content	
 */
public class Ex05 {

	public static void main(String[] args) {
		String todo =  "Auto-generated method stub";
		
		// 1. 문자열 길이 todo.length();
		
		// String.charAt(index)
		
		int strLength = todo.length();
		char one;
		char[] todoArray = new char[strLength];
		
		for (int i = 0; i < strLength; i++) {
			todoArray[i] = todo.charAt(i);
			System.out.printf("%d - %c\n", i, todoArray[i]);
		}
		
		 // char [] todoArray = todo.toCharArray();
		
	}

}
