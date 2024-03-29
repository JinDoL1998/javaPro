package days18;

public class Ex06_01 {

	public static void main(String[] args) {

		String s = "이름은 홍길동입니다.";
		//System.out.println(s);
		s += "\n이름은 김길동입니다.";
		//System.out.println(s);
		// "홍길동" ->  "XYZ"
		int foundIndex = s.indexOf("홍길동");
		s =       s.substring(0, foundIndex) 
				+ "XYZ"
				+ s.substring(foundIndex + "홍길동".length());
		// System.out.println(s);        
		// "XYZ" 삭제
		foundIndex = s.indexOf("XYZ");
		s =       s.substring(0, foundIndex)
				+ s.substring(foundIndex + "XYZ".length());
		// System.out.println(s);
		
		// 홍길동 다시 insert시킴
		foundIndex = s.indexOf("입니다");
		s =       s.substring(0, foundIndex)
				+ "홍길동"
				+ s.substring(foundIndex);
		System.out.println(s);


		System.out.println("-".repeat(40));

		// StringBuffer sb = new StringBuffer("이름은 홍길동입니다.");	// => 동기화 O
		StringBuilder sb = new StringBuilder("이름은 홍길동입니다.");	// => 동기화 x
		//System.out.println(sb);
		sb.append("\n이름은 김길동입니다.");
		// System.out.println(sb);
		
		foundIndex = sb.indexOf("홍길동");
		// sb.substring(0, foundIndex) + "XYZ"+ sb.substring(foundIndex + "홍길동".length());
		sb.delete(foundIndex, foundIndex + 3);
		// System.out.println(sb);
		
		foundIndex = sb.indexOf("입니다");
		sb.insert(foundIndex, "홍길동");
		System.out.println(sb);


	}

}
