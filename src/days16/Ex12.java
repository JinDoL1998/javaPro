package days16;

public class Ex12 {

	public static void main(String[] args) {
		
		// [클래스 간의 형변환]
		/*
		// 반드시 상속 관계가 있어야 된다.
		// Regular emp = new Temp();
		
		// 자동으로 업캐스팅(up casting)
		Regular emp = new SalesMan();
		
		// 강제로 다운캐스팅
		// cast 연산자 사용
		SalesMan sm = (SalesMan)emp;
		*/
		
		// 업캐스팅 한 놈만 다운캐스팅 가능
		Regular emp = new Regular();
		SalesMan sm = (SalesMan)emp;
		sm.getName();
		
	}

}
