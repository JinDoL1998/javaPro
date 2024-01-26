package days03;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오전 9:38:47
 * @subject
 * @content	
 */

public class Ex01_02 {

	public static void main(String[] args) {
		
		// Ctrl + Shift + O 자동으로 import 구문 처리
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		byte kor, eng, math;
		short total;
		double avg;
		
		// Scanner 구분자를 콤마(,) 사용하고 싶다. (검색) 홍길동,90,78,56
		// nextXXX 메서드 사용
		System.out.print("이름_국어_영어_수학 입력 : ");
		name = scanner.next();	// scanner.nextLine();
		
		kor = scanner.nextByte();
		
		eng = scanner.nextByte();
		
		math = scanner.nextByte();
		
		// Type mismatch: cannot convert from int to short
		// 강제 형변환 1번째 경우
		total = (short) (kor + eng + math);		// int보다 작은 자료형은 연산할 때 CPU int자료형으로 처리해서 연산
		avg = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, math, total, avg);

		
		scanner.close();
		
	}

}
