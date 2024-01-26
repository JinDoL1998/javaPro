package days11;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		
		// 순차 검색 (Sequence Search)
		int [] m = {3,5,2,4,1};
		int foundIndex = indexOf(m, 4);
		// System.out.println(foundIndex);
		
		int [] temp = new int[m.length + 5];
		
		System.arraycopy(m, 0, temp, 0, m.length);
		System.out.println(Arrays.toString(temp));
		
//		for(int i = m.length-1; i >= foundIndex; i--) {
//			temp[i+1] = temp[i];
//		}
		temp[foundIndex] = 100;
		
		for(int i = 0; i < m.length; i++) {
			if( i >= foundIndex ) {
				temp[i + 1] = m[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	private static int indexOf(int[] m, int num) {
		
		for(int i = 0; i  < m.length; i++) {
			if(m[i] == num ) return i;
		}
		
		return -1;
	}

}
