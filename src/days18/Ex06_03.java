package days18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {

		/*
	      문제 설명
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
		 */

		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("정수 입력 : ");
		String input = scanner.next();
		String regex = "10000|^[0-9]{1,4}$";

		if(input.matches(regex)) {
			n = Integer.parseInt(input);
		}
		else throw new InputMismatchException("입력 범위 오류! 1만 이하 자연수");


		System.out.println(solution(n));	

	} // main

	private static String solution(int n) {
		String answer = "";
		
		StringBuilder stringBuilder = new StringBuilder();
		
		int quotient = n / 2;
		int division = n % 2;
		
		for(int i = 0; i < quotient; i++) stringBuilder.append("수박");
		// sb.append("수박".repeat(quotient));
		if(division == 1) stringBuilder.append('수');
		
		answer = stringBuilder.toString();
		return answer;
	}
	
	/*
public static String solution(int n) {

	boolean flag = true;
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < n; i++) {
		if(flag) sb.append('수');
		else sb.append('박');
	}

	return sb.toString();
}
	 */	

















} // class
