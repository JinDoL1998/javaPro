package days26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex04 {

	public static void main(String[] args) {
		
		// [직렬화]			객체 -> 스트림
		// [역직렬화]		스트림 -> 객체
		// 객체를 직렬화해서 읽기/쓰기 할 수 있는 바이트 스트림
		// ObjectInputStream , ObjectOutputStream
		// - 클래스를 직렬화할 수 있으려면 Serializable 인터페이스를 구현만 하면 된다.
		
		// *** 상속 관계 - 직렬화 ***
		// 1) 부모를 직렬화 할 수 있는 implements Serializable을 구현한 클래스
		//    자식은 Serializable을 구현하지 않은 클래스일 경우
		//	  (결과: 자식은 serializable을 구현하지 않아도 자동으로 부모따라서 직렬화가 가능한 클래스가 됨)
		//
		// 2) 부모 클래스 : implements Serializable X
		//	  자식 클래스 : implements Serializable O
		//	  (결과 : 부모의 멤버는 직렬화 대상에서 제외된다)
		//	  (       부모 멤버도 직렬화 대상이 되도록 처리)
		
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		
		String pathName = ".\\src\\days26\\Child.ser";
		try (FileOutputStream out = new FileOutputStream(pathName);
			 ObjectOutputStream oos = new ObjectOutputStream(out)){
			oos.writeObject(c);
			oos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class

class Parent{
	String name;
}

class Child extends Parent implements Serializable{
	int age;
	// 개발자가 직접 부모의 멤버도 직렬화 대상에 추가되도록 구현
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);	// 개발자가 직접 추가
		out.defaultWriteObject(); // age
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF(); // 개발자 직접 추가
		in.defaultReadObject(); // age
	}
}

/* [1] 테스트
class Parent implements Serializable{
	String name;
}

class Child extends Parent{
	int age;
}
*/