package days17;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	
	// 익명클래스(한번만 쓸거라서 클래스 생성 안해주고 사용)
	private Engine engine2 = new Engine() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void moreFuel(int fuel) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lessFuel(int fuel) {
			// TODO Auto-generated method stub
			
		}
	};
		
	//    인터페이스 (  다형성  )
	private Engine engine = null;
			
	// Getter, Setter 
	public Engine getEngine() {
		return engine;
	}

	//                     H,S,K_Engine  매개변수 다형성
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 생성자
    public Car() { }

    //        H,S,K_Engine 매개변수 다형성
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드 
    void speedUp(int fuel) {
    	this.engine.moreFuel(fuel);
    }
    void speedDown(int fuel) {
    	this.engine.lessFuel(fuel);
    }
    void stop() {
    	this.engine.stop();
    }

}
