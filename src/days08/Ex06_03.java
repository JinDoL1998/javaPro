package days08;

public class Ex06_03 {
	public static void main(String[] args) {
		
		String rrn = "830412-1700001";
		
		// 주민등록번호를 출력
		// 830412-1******
		
		// String String.subString(beginIndex, endIndex)
		
//		String printRRN = rrn.substring(0, 8) + "******";
		
		//String String.concat(); 문자열 연결
		System.out.println( "실행결과 : " + rrn.substring(0,8).concat("******"));
		
		
	}
}
