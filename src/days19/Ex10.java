package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		
		// 정규표현식(Regular Expression) == 정규식
		// - 문자열 속에 원하는 조건(패턴과) 일치하는 문자열을 찾기위해 사용
		// - 미리 정의된 기호
		// - java.util.regex 패키지
		//		ㄴ Pattern 클래스
		//		ㄴ Matcher 클래스
		// 
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		// 1) c로 시작하는 모든 문자(data)를 출력
		/*
		for(int i = 0; i < data.length; i++) {
			if(data[i].startsWith("c")) {
				System.out.println(data[i]);
			}
		}
		*/
		
		String regex = "c.*";
		regex = "c[a-zA-Z]*";
		regex = "c[a-zA-Z0-9]*";
		regex = "c\\w*";	// "c[a-zA-Z0-9]" == \\w
		regex = "c.";
		regex = "c\\.";
		regex = "c[0-9]";
		regex = "c\\d";
		regex = "c.*t";
		regex = "c[^0-9]";
		regex = "c\\D";		// c[^0-9] == \\D
		regex = "(b|c).{2}";
		regex = "[bc].{2}";
		regex = "[bcd].{2,3}";
		regex = "[b-d].{2,3}";
		// bcd문자는 제외한 알파벳 대소문자
		regex = "[A-Za-z&&[^b-d]].*";	// * 0개 이상
		regex = "[A-Za-z&&[^b-d]].+";	// * 1개 이상
		regex = "[A-Za-z&&[^b-d]].?";	// ? 0 or 1
		Pattern p = Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) System.out.println(data[i]);
		}
		
	} // main

} // class
