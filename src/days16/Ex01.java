package days16;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		String n = "keNik";   
		String m= "kKnie";   

		위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
		결과는 같을 경우 true/ 다를 경우 false 로 출력.
		조건) 대소문자는 구분하지 않는다.  
		*/
		
		String n = "keNik";   
		String m = "kKnie";

		// 1. n, m 대문자 변환
		n = n.toUpperCase();
		m = m.toUpperCase();

		// 2. n, m 문자열 오름차순 정렬
		char[] nArr = n.toCharArray();
		Arrays.sort(nArr);
		
		char[] mArr = m.toCharArray();
		Arrays.sort(mArr);
		
		// 3. n, m 같냐? true / false
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		System.out.println(n.equals(m));
		
		
	}

}
