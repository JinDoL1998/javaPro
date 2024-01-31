package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Ex03 {

	public static void main(String[] args) {
		
		LinkedHashSet<Person2> lhs = new LinkedHashSet<>();
		lhs.add(new Person2("admin", "관리자", 45));
		lhs.add(new Person2("111", "김진성", 25));
		lhs.add(new Person2("222", "김길동", 26));
		
		// [빌더패턴] @Builder
		// 가독성, 생성자의 파라미터 순서 상관 없다.
		lhs.add(new Person2().builder().id("admin").age(38).name("홍길동").build());
		
		// 출력
		Iterator<Person2> ir = lhs.iterator();
		while (ir.hasNext()) {
			Person2 p = ir.next();
			System.out.println(p);
			
		}
		
	}

}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
class Person2{
	private String id;
	private String name;
	private int age;
	@Override
	public int hashCode() {
		
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 p = (Person2) obj;
			return this.id.equals(p.id);
		}
		return false;
	}
	
	
	
}
