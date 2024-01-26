package days04;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오전 10:47:34
 * @subject	인덱스(index) 연산자
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// String[] args	: [] 인덱스(index) 연산자
		// 1. 한 학생의 국어 점수를 저장할 kor 변수 선언
		// int kor;
		
		// 2. 10명 학생의 국어 점수를 저장할 변수를 선언
		// int kor01, kor02, kor03, ..., kor10;
		
		// 배열 : 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것
		// 배열 장점 : 관리 용이
		// 배열 선언 형식 : 자료형[] 배열명;
		int[] kors;
		
		// 배열 선언 및 생성혁식
		
		//new 자료형[배열의크기]
		
		
		kors = new int[3];
		
		// 배열의 크기 배열명.lenth
		// arg 크기 배열명lengrh
		System.out.printf("배열의 크기 : %d\n", kors.length);
		
//		System.out.printf("배열 크기 : %d\n", kors);		
		// int kor = 90;
		
		// 첫 기억공간 : 0번쨰 요소 배열명[0] kors[0]
		
		// 두 기억공간 : 1번쨰 요소
		
		kors[0] = 90;
		kors[1] = 80;
		kors[2] = 89;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
		// index 첨자값
		// lowerBound 아랫첨자값 0
		// upperBand 윗첨자값	2=  배열크기 - 1 = 배멸명.lenth - 1
		
		// ArrayIndexOutOfBoundsException
		// kors[3] = 100;
		
		kors = null;
		// NullPointerException
		kors[0] = 90;
		
	}
}
