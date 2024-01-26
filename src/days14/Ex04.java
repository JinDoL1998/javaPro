package days14;

/**
 * @author jinseong
 * @date 2024. 1. 18. - 오전 11:24:04
 * @subject
 * @content	
 */
public class Ex04 {
	
	private  class Member {
		// apaqj
	}

	public static void main(String[] args) {

		/*
		 * [접근지정자 설명]
		 * 1. 클래스 앞의 접근지정자
		 * 	  1) public	: 패키지 내부, 외부 어디서든 상속과 참조 가능
		 * 		(패키지 내부)
		 * 		days14.Ex04.java
		 * 		days14.Tv.java
		 * 
		 * 		패키지외부
		 * 		days13.Ex.01.java
		 * 		import.Days14.Tv
		 * 
		 * 		day14.Tv
		 */
				Tv tv1 = new Tv();

		/*
		 * 	  2) package(X(클래스명 앞에 아무것도 안붙음), default) : 패키지 내부, 외부 어디서든 상속, 참조 가능
		 * 		(패키지 내부)
		 * 		days14.Ex04.java
		 * 		days14.Tv.java
		 * 
		 * 		패키지외부
		 * 		days13.Ex.01.java
		 * 		import.Days14.Student
		 */
				
		/*
		 * 		독립적인 클래스를 선언할때는 사용할 수 없는 접근지정자이다.
		 * 		<-> 중첩클래스 안에 클래스 선언
		 * 		*** 내부 클래스 4가지
		 * 		
		 * 	  3) private	(비활성화) : 같은 파일 내에서만 상속, 참조 가능
		 * 				 
		 * 	  4) protected	(비활성화) : 2)package 기능 + 패키지 외부에
		 * 
		 *  1-2 클래스 앞의 기타제어자
		 *  	1) abstrat - 추상클래스
		 *  	2) final - 	 최좈클래서(상속) 
		 *  	   상수
		 *  	doM;P
		 *  	3) static - 비활성화 - 중첩클래스 선언시만 사용 가능
		 * 
		 * 2. 멤버	 앞의 접근지정자
		 * 		1) public
		 * 		2) package
		 * 		3) private
		 * 		4) protected
		 * 
		 */
					

	}

}
