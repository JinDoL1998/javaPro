package days07;

/**
 * @author jinseong
 * @date 2024. 1. 9. - 오전 11:36:20
 * @subject
 * @content	
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 정규표현식
		// 회원가입 - 주소, 우편번호
		
		String regex = "\\d{5}|\\d{3}-\\d{3}";
		// 정규표현식		(n)  (복횟수   n
		// 					(n,m) 반복회수 n-m
		//					(n,) 반복횧수 n 이상
		//					\\s	 공백
		//					* 	 반복횟수 0~ 여러개 0이상
		//					+	 반복횟수 1 ~ 여러개 1.이상
		//						 반복횟수
		
		String[] zipCodes = {"123-456", "123456", "123-4a6", "123-4567"};
		
		for(int i = 0; i < zipCodes.length; i++) {
			String zipCode = zipCodes[i];
			boolean b = zipCode.matches(regex);
			System.out.println(b);
		}
		
				
		
	}

}
