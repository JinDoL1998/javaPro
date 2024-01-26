package days20;

import java.text.MessageFormat;

public class Ex07 {

	public static void main(String[] args) {
		
		// DF, SDF, CF, MF 4가지
		// [MessageFormat] 형식화 클래스
		// 데이터(값) -> 특정 형식으로 출력
		// 특정형식문자열 -> 데이터(값) 읽기
		String name = "김진성";
		int age = 25;
		boolean gender = true;
		double height = 177.12;
		char grade = 'A';
		
		// 이름:김진성, 나이:25세, 성별:남자, 키:177.12, 등급:A 입니다.
		// [1]
		/*
		String output = String.format("이름:%s, 나이:%d세, 성별:%s, 키:%.2f, 등급:%c 입니다\n"
										, name, age, gender ? "남자" : "여자", height, grade);
		System.out.println(output);
		*/
		
		String pattern = "이름:{0}, 나이:{1}세, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
		String output = MessageFormat.format(pattern, name, age, gender ? "남자" : "여자", height, grade);
		System.out.println(output);
		
	} // main

} // class
