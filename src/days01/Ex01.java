/* 자바 프로그램의 기본 구조(형식)
	ㄱ. package 패키지명; 선언
		패키지 : 서로 연관된 클래스들의 묶음
				 효율적으로 관리.
		패키지명 == 물리적으로 폴더명
		반드시 클래스 파일의 첫번째 줄에 선언
	ㄴ.	자바는 객체지향적 프로그래밍 언어이다.
	객체 = Object = 개체 = 클래스 = 물건 
	시작물건 = 시작객체 = 시작개체 = 시작클래스

	[자바에서 클래스 선언 형식]
   접근지정자               클래스 클래스명 
	[public] [기타제어자]    class  Hello{}	 *[] 생략가능
	접근지정자 + 기타제어자 = modifier

	ㄷ. 반드시 프로그램을 시작/종료하는 기능의 main() 함수가 필요하다. 
	[ 자바에서 함수(메서드) 선언 형식 ]
	접근지정자 + 기타제어자 + 반환자료형 + 함수명(파라미터 == 인자 == 매개변수) {}
*/

package days01;

/**
 * @author jinseong
 * @date 2023. 12. 29. - 오후 2:37:00
 * @subject 수업 1일차 첫 번째 예제
 * @content	JDK 11설치 및 확인
 * 			자바 프로그램의 기본 구조 설명
 * 			자바 클래스 선언 형식
 * 			자바 
 */

public class Ex01{
	public static void main(String[] args) {	// 프로그램 시작
		
		// 주석(comment) 처리
		// 프로그램 실행에서는 상관없이 설명을 하기 위한 것
		/*
		 * 여러줄 주석
		 */
		
	} // 프로그램 종료
}