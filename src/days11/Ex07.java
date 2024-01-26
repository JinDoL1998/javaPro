package days11;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author jinseong
 * @date 2024. 1. 15. - 오후 2:20:19
 * @subject 배열에서 가장 큰 값이 있는 인덱스값을 배열에 저장 후 출력
 * @content	
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// max 가장 큰 값을 찾아서 그위치(index)를 배열에 담아서 출력
		int [] maxIndexArray;
		// 1) max
		int max = IntStream.of(m).max().getAsInt();
		System.out.println(max);
		
		// 2) max 개수 -> maxIndexArray 배열의 크기
		/*
		int maxCount = 0;
		for(int i = 0; i < m.length; i++) {
			if(max == m[i]) maxCount++;
		}
		System.out.println(maxCount);
		 */
		
		int maxCount = (int)IntStream.of(m).filter(i -> i==max).count();
		
		// 3) max의 index를 maxIndexArray 배열에 저장
		maxIndexArray = new int[maxCount];
		for(int i = 0, idx = 0; i < m.length; i++) {
			if(max == m[i]) maxIndexArray[idx++] = i;
		}
		// 4) 배열 출력
		System.out.println(Arrays.toString(maxIndexArray));

		
		
	}


}
