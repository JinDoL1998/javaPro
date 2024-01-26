package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오전 9:38:47
 * @subject
 * @content	
 */

public class Ex01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte kor, eng, math;
		short total;
		double avg;
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 입력 : ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수 입력 : ");
		math = Byte.parseByte(br.readLine());
		
		// Type mismatch: cannot convert from int to short
		// 강제 형변환 1번째 경우
		total = (short) (kor + eng + math);		// int보다 작은 자료형은 연산할 때 CPU int자료형으로 처리해서 연산
		avg = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, math, total, avg);

		
		
		
	}

}
