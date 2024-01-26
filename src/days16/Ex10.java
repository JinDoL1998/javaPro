package days16;

public class Ex10 {

	public static void main(String[] args) {

		
		// [1] 사원 객체 생성
		/*
		Employee emp1 = new Employee("김진성", "서울 강남구", "010-1234-1234", "2024.01.22");
		emp1.dispEmployeeInfo();

		// Object.toString()
		// days16.Employee@2a18f23c
		// 패키지명.클래스명@16진수값
		// toString() 가 사원 정보를 출력하도록 오버라이딩(재정의 함수) 
		System.out.println(emp1.toString());
		System.out.println( emp1 );
		*/

		/*
		// [2] 정규직 객체 생성
		// 클래스의 형변환
		Regular emp2 = new Regular("김진성", "서울 강남구", "010-1234-1234", "2024.01.22", 4000000);
		// Employee로 부터 상속받은 dispEmployeeInfo() 메서드 단점(문제점...
		// 사원정보를 출력하는데 basicPay 는 출력 x
		// emp2.dispEmployeeInfo();
		System.out.println(emp2.toString());
		*/
		
		
		// 정규직은 사원이다 ( is-a 관계 )
		// 자식 객체(new Regular)를 생성해서 부모클래스에 참조시킬 수 있다.
		// 클래스의 자동형변환( Up Casting )
		// 클래스의 형변환
		// Employee emp2 = new Regular("김진성", "서울 강남구", "010-1234-1234", "2024.01.22", 4000000);
		
		// [3]
		// Up Casting 클래스간의 형변환
		// Employee emp3 = new SalesMan("김진성", "부산광역시 해운대구", "010-789-4567", "2024.01.22", 4000000, 20, 70000);
		// 문제점
		// System.out.println(emp3.getPay());
		
		// [4]
		// 클래스 간의 형변환 - Up Casting (자동 형변환)
		Employee emp4 = new Temp("김진성", "부산광역시 해운대구", "010-7890-4567", "2024.01.22", 20, 150000);
		emp4.dispEmployeeInfo();
		// 문제점
		// System.out.println(emp4.getPay());
				

	} // main

} // class
