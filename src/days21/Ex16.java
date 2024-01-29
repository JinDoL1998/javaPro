package days21;

import java.util.ArrayList;

public class Ex16 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("원대안");
		list.add("이시은");
		list.add("박우현");
		list.add("이재호");
		list.add("윤형준");
		list.add("이동찬");
		list.add("한재호");
		list.add("이동영");
		list.add("류영은");
		
		System.out.println(list);
		
		/* 팀에서 '이'씨 성을 가진 팀원 삭제
		for(int i=0; i < list.size(); i++) {
			String name = (String)list.get(i);
			if( name.startsWith("이")) {
				list.remove(name);
			}
			
		}
		*/
		
		// [암기] 위의 코딩과 처리과정이 동일
		list.removeIf(n -> ((String)n).charAt(0) == '이');
		
		
		System.out.println(list);
		
	} // main

} // class
