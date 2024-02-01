package days24;

public class Ex06_01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 제네릭 타입은 클래스, 메서드에 선언할 수 있다.
		 * 		ㄴ 제네릭 클래스
		 * 		ㄴ 제네릭 메서드
		 */
		
		/*
		Box box1 = new Box();
		// box1.setItem(100);
		// box1.setItem(3.14);
		// box1.setItem("김진성");
		box1.setItem(new MemberVO());
		
		// 형변환에 불편함
		MemberVO vo = (MemberVO) box1.getItem();
		System.out.println(box1.getItem());
		*/
		
		Box<MemberVO> box1 = new Box<>();
		box1.setItem(new MemberVO());
		MemberVO vo = box1.getItem();	// 형변환x
		
		/*
		 * 1. Box<T> - 제네릭 클래스, 'T의 Box'
		 * 2. 	  T - 타입 변수 or 타입 매개변수
		 * 3. 타입변수 - T, E, K, V 등등
		 * 		T : Type
		 * 		E : Element
		 * 		K : key
		 * 		V : value
		 * 4. Box - 원시 타입 (RAW TYPE)
		 * 
		 */
		
	} // main

} // class

// 제네릭 클래스
class Box<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}

/*
class Box{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	
}
*/

/*
class Box{
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
}
*/

/*
class Box{
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
	
}
*/

/*
class Box{
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
	
}
*/