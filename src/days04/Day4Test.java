package days04;

import java.util.Scanner;

public class Day4Test {

	public static void main(String[] args) {
		
//		int kor, eng, math;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("국어점수 3명 입력 : ");
//		String data = scanner.next();
//		
//		String datas[] = data.split(",");
//		
//		kor = Integer.parseInt(datas[0]);
//		eng = Integer.parseInt(datas[1]);
//		math = Integer.parseInt(datas[2]);
//		
//		System.out.printf("%d %d %d\n", kor, eng, math);
		
		/* 
		   한 문자를 입력받아서
		   숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
		   입니다라고 출력하세요.
		   
		   BufferedReader br	br.readLine()
		   Scanner scanner		scanner.nextXXX()
		   
		   "a" -> 'a' 변환
		   문자열 -> 한문자 변환x
		   문자나열 속에서 첫 번째 문자를 얻어오겠다
		   'a\0'
		*/
		
		// char String.charAt(int index_
		String test = "안녕하세요";
		System.out.println( test.charAt(2) );
		
		char ch;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("한 문자 입력 : ");
			String inputData = scanner.next();
			ch = inputData.charAt(0);
			
			if (ch >= '0' && ch <= '9') System.out.println("숫자");
			else if(('A' <= ch && 'Z' >= ch) && (ch >= 'a' && ch <= 'z'));
								System.out.println("알파벳");
				
		} catch (Exception e) {

		}
		
		
		// int [] kors = new int[3];
		
		// 배열은 초기화 하지 않아도 그 자료형의 초기값으로 되어있따.
		// int : 0
		// double : 0.0
		// char '\-''
		// boolean : false
		// String : null
		
		// 배열 선언 + 초기화(동시) == 배열초기화
		// int kors[] = new int[] { 90, 38, 88 };
		int kors[] = { 90, 38, 88 };	// 암기
		
		for(int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d]=%d\n",i ,kors[i]);
		}
		
		
		
		
		
		
		
	}

}
