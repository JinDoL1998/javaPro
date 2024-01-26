package days16;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	
	// 결합력이 높은 코딩 =>> 좋은 코딩 X
	// 엔진 		객체
	// private Engine engine = new Engine();	// has - a 관계
	private Engine engine = null;
	
	// Getter Setter
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// 생성자
	public Car() {
		engine = new Engine(); // 생성자 초기화
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	


	// 메서드
	void speedUp(int fuel) {
		// NullPointerException 예외(에러) 발생
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void Stop() {
		this.engine.stop();
	}
	
}
