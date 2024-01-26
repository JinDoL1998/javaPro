package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오전 11:45:41
 * @subject	이름, 국, 영, 수 한 번에 입력
 * @content	총점, 평균
 * 			BufferedReader 사용한 예제 (내일 복습 문제)
 * 			
 * 			배열 사용
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, math, total;
		double avg;

		System.out.print("이름, 국어, 영어, 수학 입력 : ");
		
		String data = br.readLine();
		
		// 콤마를 구분자로 dad문자열을 잘라내기
		// String String.format(String format, Object...args)
		// boolean String.equals(비교할문자)
		// String[] String.split( 구분자 )
		String regex = ",";
		String[] datas = data.split(regex);
		
		name = datas[0].trim();	// "김진성"
		kor = Integer.parseInt(datas[1].trim());	//	12
		eng = Integer.parseInt(datas[2].trim());	//	34
		math = Integer.parseInt(datas[3].trim());	//	56
		
		total = (short) (kor + eng + math);	
		avg = total / 3.0;

		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, math, total, avg);

	}

}
