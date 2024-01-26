package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오전 10:20:33
 * @subject
 * @content	
 */
public class Ex01_01 {

	public static void main(String[] args) {
		
		// 숫자 체크 : Character.isDigit()
		
		char one = '1';
		System.out.println(Character.isDigit( one ));
		if(Character.isDigit(one)) {
			System.out.println("숫자 O");
		}
		else {
			System.out.println("숫자 X");
		}
		
		one = 'A';
		one = 'a';
		one = '9';
		// one = '한';
		System.out.println(Character.isAlphabetic(one));
		
		
	}

}
