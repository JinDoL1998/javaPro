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
public class Ex03_01 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, math, total;
		double avg;

		System.out.print("이름, 국어, 영어, 수학 입력 : ");
		
		String data = br.readLine();

		String regex = "\\s*,\\s*";
		String[] datas = data.split(regex);
		
		name = datas[0];	
		kor = Integer.parseInt(datas[1]);	
		eng = Integer.parseInt(datas[2]);	
		math = Integer.parseInt(datas[3]);	
		
		total = (short) (kor + eng + math);	
		avg = total / 3.0;

		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f", name, kor, eng, math, total, avg);

	}

}
