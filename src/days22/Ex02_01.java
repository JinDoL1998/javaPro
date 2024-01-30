package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex02_01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Person2("김진성", 25));
		list.add(new Person2("이동영", 20));
		list.add(new Person2("류영은", 27));
		list.add(new Person2("한재호", 23));
		list.add(new Person2("조연화", 29));
		
		System.out.println(list);
		
		// 오름차순 정렬
		list.sort(null);
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println(p);
			
		}

	} // main

} // class

@Data
@AllArgsConstructor
class Person2 implements Comparable{
	private String name;
	private int age;
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return p.age - this.age;	// 0 양수 음수 int
	}	
	
}
