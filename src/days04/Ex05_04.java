package days04;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오후 3:08:58
 * @subject	조건문 if, if~else 활용
 * @content	국어 점수를 입력받아서
 * 			등급(수, 우, 미, 양, 가) 출력
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		int kor;
		
		try (Scanner scanner = new Scanner(System.in)){
			
			System.out.print("국어 점수 입력 : ");
			kor = scanner.nextInt();
			
			if (kor >= 90) System.out.println("수");
			if (kor >= 80 && kor < 90) System.out.println("우");
			if (kor >= 70 && kor < 80) System.out.println("미");
			if (kor >= 60 && kor < 70) System.out.println("양");
			if (kor >= 0 && kor < 60) System.out.println("가");
			
		} catch (Exception e) {
			
		}
		
	}

}
