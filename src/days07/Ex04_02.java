package days07;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		
		String email;
		Scanner scanner = new Scanner(System.in);
		System.out.print("이메일 입력 : ");
		email = scanner.nextLine();
		
		String regex = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";
		
		if(email.matches(regex)) {
			System.out.println("이메일 사용 가능");
		} else {
			System.out.println("이메일 사용 불가능");
		}
		
		// 회원가입
		// 비밀번호 - 8~15자리
		//			  %$#@ 특수문자 반드시 1개 이상
		//			  0~9 숫자 반드시 1개 이상
		//			  알파벳 대소문자 반드시 1개 이상
		// 정규표현식을 검색해서 카톡으로 보내기
		
	}

}
