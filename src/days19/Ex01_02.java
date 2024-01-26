package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_02 {

	public static void main(String[] args) {
		
		String[] names = {"김영진", "김진성", "구본혁", "권맑음"};
		System.out.println(Arrays.toString(names));
		
		// Arrays.sort(names);
		// System.out.println(Arrays.toString(names));
		
		/*					익명 클래스
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		// 위 주석 코딩과 동일한 코딩 => 람다식으로 표현
		Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		System.out.println(Arrays.toString(names));
	}

}
