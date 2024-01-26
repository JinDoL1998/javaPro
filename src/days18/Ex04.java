package days18;

/**
 * @author jinseong
 * @date 2024. 1. 24. - 오후 12:15:59
 * @subject	[문자열 다루는 클래스]
 * @content	1. String 	*** 변경 불가능한 클래스
 * 			2. StringBuffer
 * 			3. StringBuilder
 * 			4. StringTokenizer
 */
public class Ex04 {

	public static void main(String[] args) {

		String name = "홍길동";
		name += "님";
		name += "안녕";


		// String name = "홍길동";
		// name = "김진성";

		// String 타입(자료형) - 클래스, 참조타입
		// String name = new String("홍길동");
		// name = new String("김진성");

		// [ String.Method 이해, 암기 ]
		// 1. char charAt(int index)
		// 2. int length()
		int len = name.length();
		for(int i = 0; i < len; i++) {
			System.out.printf("name[%d]=%c\n", i, name.charAt(i));
		}

		// 3. substring() 98[06][29]-1234567
		// name 문자열 속에서 안녕이라는 문자열이 있는지 여부 확인 후에
		// "안녕"을 "Hi" 문자열로 변경하라
		boolean isExist = name.contains("안녕");
		if(isExist) System.out.println("안녕은 문자열 안에 있다,");
		else System.out.println("안녕은 문자열 안에 있다,");
		
		
		int foundIndex = -1;
		if((foundIndex = name.indexOf("안녕")) == -1) {
			System.out.println("안녕은 문자열 안에 없다.");
		}
		else {
			System.out.printf("안녕은 %d 위치에있다.", foundIndex);
			
			String s= name.substring(0, foundIndex);
			System.out.println(s.concat("HI")
					.concat(name.substring(foundIndex) + "안녕".length()));
		}
		
		System.out.println(name.replace("안녕", "Hi"));

	}

}
