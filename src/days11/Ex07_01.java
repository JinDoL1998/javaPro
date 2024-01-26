package days11;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author jinseong
 * @date 2024. 1. 15. - 오후 2:20:19
 * @subject 
 * @content	
 * 
 */
public class Ex07_01 {

	public static void main(String[] args) {

		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };

		// max 가장 큰 값을 찾아서 그위치(index)를 배열에 담아서 출력
		int [] maxIndexArray;

		// 1) max + 2) max 갯수
		int max = m[0], maxCount = 1;
		for(int i = 1; i < m.length; i++) {
			if(m[i] == max) maxCount++;
			else if(m[i] > max) {
				max= m[i];
				maxCount = 1;
			}
		}

		System.out.println(max);
		System.out.println(maxCount);




	}
	
	// 배열에서 가장 큰값과 최대값개수를 int[]로 반환하는 함수
	private static int[] getArrayMaxAndCount(int[] m) {
		int max = m[0] , maxCount = 1;
		for (int i = 1; i < m.length; i++) {
			if( max == m[i]) maxCount++;
			else if( max < m[i]) {
				max = m[i];
				maxCount = 1;
			}
		} // for

		// return new int[] { max, maxCount };
		int [] mc = new int[2];
		mc[0]=max;
		mc[1]=maxCount;
		return mc;
	}


}
