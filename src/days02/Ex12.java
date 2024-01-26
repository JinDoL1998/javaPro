package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오후 5:13:19
 * @subject	이름, 국어, 영어, 수학 입력
 * @content	총점, 평균 계산
 * 		[출력형식]
 * 		홍길동님은 국:89 영:78 수:56 총점:000 평균:00.00 이다.
 */

public class Ex12 {

	public static void main(String[] args) throws IOException {
		
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
		
		//Type mismatch: cannot convert from int to short
		total = (short) (kor + eng + math);
		avg = total / 3.0;
		
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, math, total, avg);
		
		
	}

}
