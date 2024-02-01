package days24;

import java.util.ArrayList;

/**
 * @author jinseong
 * @date 2024. 2. 1. - 오후 3:10:13
 * @subject	제한된 제네릭 클래스
 * @content	Box<T> Type 모든 자료형
 * 
 * 			T 먹을 수 있는 과일 타입으로 제한
 * 
 * 			class Box04<T extends Fruit & eatable> 이해
 */
public class Ex06_04 {

	public static void main(String[] args) {
		
		/*
		// Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type Box04<T>
		Box04<Toy> toyBox = new Box04<>();
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		*/
		/*
		Box04<Apple> aBox = new Box04<>();
		Box04<Grape> bBox = new Box04<>();
		*/
		// Box04<Bread> cBox = new Box04<>();
		
	} // main

} // class

/*
interface eatable{
	// 
}

class Fruit extends Object implements eatable{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Toy{
	public String toString() {
		return "Toy";
	}
	
}

class Bread implements eatable{
	
}

// 먹을 수 있는 과일만 T타입으로 + 제네릭 클래스 선언
// class Box04<T> {
// class Box04<T extends Fruit> {
class Box04<T extends Fruit & eatable> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item); }
	int size() {return this.list.size(); }
	T get(int i) {return this.list.get(i); }
	public String toString() {return this.list.toString(); }
}
*/