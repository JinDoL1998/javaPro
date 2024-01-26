package days04;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오후 3:08:58
 * @subject	조건문 if, if~else 활용
 * @content	국어 점수를 입력받아서
 * 			등급(수, 우, 미, 양, 가) 출력
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		int kor;
		char grade;
		
		try (Scanner scanner = new Scanner(System.in)){
			
			System.out.print("국어 점수 입력 : ");
			kor = scanner.nextInt();
			
			if (kor <= 100 && kor >= 0) {
				
				if (kor >= 90) grade = '수';
				else if (kor >= 80 && kor < 90) grade = '우';
				else if (kor >= 70 && kor < 80) grade = '미';
				else if (kor >= 60 && kor < 70) grade = '양';
				else grade = '가';
				
				System.out.printf("점수 : %d은(는) 등급 : %c", kor, grade);
				
			} else {
				System.out.println("국어 점수(0~100). 입력잘못!!");
			}
			
			
		} catch (Exception e) {
			System.out.println("국어 점수(0~100). 입력잘못(숫자x)!!");

		}
		
	}

}
