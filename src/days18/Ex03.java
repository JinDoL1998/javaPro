package days18;

/**
 * @author jinseong
 * @date 2024. 1. 24. - 오후 12:06:54
 * @subject	[ 객체로 부터 Class 객체를 얻어오는 방법 3가지 ]
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) {
	
		// 1. Object.getClass()
		/*
		Person p = new Person("111", "홍길동");
		Class cls = p.getClass(); 
		*/
		
		// 2. 모든 클래스마다 class 클래스 변수가 제동된다.
		/*
		Class cls = Person.class;
		System.out.println(cls); // class days18.Person
		*/
		
		/*
		try {
			// Peroson 클래스 -> Person 객체 p1 생성
			Person p1 = Person.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//3 .
		String fullName = "days18.Person";
		try {
			Class cls  = Class.forName("java.leng.Theard");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} // main

} // class

