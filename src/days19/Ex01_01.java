package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Ex01_01 {


	public static void main(String[] args) {
		
		int[] m = {3,5,2,4,1};
		/*
		Arrays.sort(m); // 오름차순
		
		// 내림차순
		int [] temp = new int[m.length];
		for(int i = 0; i < m.length; i++) {
			temp[m.length-1-i] = m[i];
		}
		*/
		
		// int[] => Integer[] 변환
		// IntStream -> Stream<Integer> -> Integer[]
		// boxing, unboxing
		Integer[] mIntegerArr = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(mIntegerArr, Collections.reverseOrder());
		
		// Integer[] => int[] 변환
		m = Stream.of(mIntegerArr).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(m));
		
		
	}

}
