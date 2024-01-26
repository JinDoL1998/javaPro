package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오전 10:35:18
 * @subject
 * @content	
 */
public class Ex01_03 {

	public static void main(String[] args) {

		char one = '$';      
		String strCheck = "#@$!";

		//							정규표현식
		// boolean String.matches( regex )
		
		// String regex = "one == '#" || one == '@' || one == '$' || one == '!'";
		// 숫자	\d{1,3} == [0-9]{1,3}
		// [0-9] = [0123456789]
		// [A-Za-z0-9]
		
		String regex = "[#@$!]";
		if( (one + "").matches(regex)) {
			System.out.println("특수문자 O");
		} else {
			System.out.println("특수문자 X");
		}

	}

}
