package days22;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Ex12 {

	public static void main(String[] args) {
		
		// 시험
		// 사람 -> HashSet X		순서유지x, 중복허용x
		// 사람 -> LinkedHashSet 	순서유지o, 중복허용x
		
		Person3 p1 = new Person3("111111-1111111", "김진성", 25	);
		System.out.println(p1.hashCode());
		
		Set<Person3> s = new LinkedHashSet<Person3>();
		s.add(p1);
		s.add(new Person3("222222-2222222", "홍길동", 22));
		s.add(new Person3("333333-3333333", "김길동", 21));
		// System.out.println(s.size());
		
		// 주민등록번호가 같으면 같은 Person객체로 인식해서 
		// LinkedHashSet 추가 X
		// 방법 ? hashCode(), equals() 오버라이딩... 
		Person3 p4 = new Person3("111111-1111111", "유진", 20);
		System.out.println(p4.hashCode());
		
		s.add(p4);
		
		Iterator<Person3> ir = s.iterator();
		while (ir.hasNext()) {
			Person3 p = ir.next();
			System.out.println(p);
		}
		
		
		
	} // main

} // class

@NoArgsConstructor
@AllArgsConstructor
@ToString
class Person3{
	String rrn;
	String name;
	int age;
	@Override
	public int hashCode() {
		return this.rrn.hashCode();	// 같은 주민등록번호면 같은 해시코드값을 가진다.
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person3) {
			Person3 p = (Person3)obj;
			return this.rrn.equals(p.rrn);
		}
		
		return false;
	}
	
	
} // Person3
