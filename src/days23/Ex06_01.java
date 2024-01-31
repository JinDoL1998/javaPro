package days23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Ex06_01 {

	public static void main(String[] args) {
		
		// List, Set
		// [Map 인터페이스를 구현한 컬렉션 클래스]
		/*
		 * 1. 한쌍(key+ value) == Entry으로 관리
		 * 2. key	중복허용 x
		 * 	  value 중복허용 O
		 * 3. HashMap	(신) - 사용권장
		 * 	  HasTable	(구)
		 * 4. 해싱(Hashing)
		 * 	  - 해시함수를 이용해서 데이터를 해시 테이블에 저장하고 검색하는 기법.
		 * 
		 * 	  - 해시함수? 데이터가 저장되는 곳을 알려주는 함수.
		 * 				  데이터를 빠르게 검색할 수 있다.
		 * 
		 * 	  - 데이터저장(key + value) 키를 해시 함수에 넣으면 
		 * 		배열의 한 요소를 얻어오고
		 * 		다시 그 곳에 연결된 LinkedList에 데이터를 저장
		 * 
		 * 	  - 해싱을 사용하기 때문에 많은 양의 데이터를 검색하는데 뛰어난 성능이 있다.
		 * 	
		 * 		데이터가 저장되어있는 곳을 알려주는 함수
		 * 		[해시함수]
		 * 		
		 */
		
		// <E> Element == 요소
		// <K, V> Key, Value
		// HashMap<String, String> ht = new HashMap<>(11, 0.75);
		HashMap<String, String> ht = new HashMap<>();
		ht.put("admin", "관리자");
		ht.put("hong", "홍길동");
		ht.put("root", "관리자");
		System.out.println(ht);
		System.out.println(ht.size()); 	// 엔트리의 개수
		
		// 모든 key 조회.
		/*
		Enumeration<String> en = ht.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			System.out.println(key);
			
		}
		*/
		
		// 모든 key조회
		/*
		Set<String> keys = ht.keySet();
		Iterator<String> rs = keys.iterator();
		while (rs.hasNext()) {
			String key = rs.next();
			System.out.println(key);
		}
		*/
		
		/*
		// key를 알때 value 값을 얻어오는 방법
		// String value = ht.get("root");
		String value = ht.getOrDefault("jinseong", "진성");
		System.out.println(value);
		
		// 모든 value 조회
		
		Collection<String> values = ht.values();
		
		for(String value1: values) {
			System.out.println(value1);
		}
		*/
		
		
		// 문제 park	키가 존재하는 지 확인한 후에
		//		park 	박철로 엔트리를 추가하세요
		// ht.contains(value);
		// ht.containsKey(key);
		// ht.containsValue(value);
		
		//if(!ht.containsKey("park")) ht.put("park", "박철");
		//System.out.println(ht);
		
		
		// 해시테이블 출력하는 메서드() 호출
		dispHT(ht);
		
		
	} // main
	/*
	private static void dispHT(HashMap<String, String> ht) {
		
		// key : value
		
		 * hong : 홍길도
		 * root : 관리자
		 * admin : 관리자
		 
		
		Enumeration<String> en = ht.keys();
	
		Collection<String> values = ht.values();
		
		for(String value: values) {
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				System.out.print(key + ":");
				
				System.out.println(value);
			}
		}
		
		Enumeration<String> en = ht.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = ht.get(key);	// value = get(key)
			System.out.printf("%s : %s\n", key, value);
			
		}
	}
	*/

	private static void dispHT(HashMap<String, String> ht) {
		Set<Entry<String, String>> es = ht.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s : %s\n", key,value);
		}
		
	}
	
	
} // class
