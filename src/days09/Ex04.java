package days09;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		// 10 => 00000000 00000000 00000000 00001010
		
		int n = 10;
//		String binaryNum = Integer.toBinaryString(n);
		
		int[] binaryArray = new int[32];
		int index = binaryArray.length - 1;
		
		while ( n != 0 ) {
			binaryArray[index--] = n % 2;
			n /= 2;
		}
		
		// System.out.println(Arrays.toString(binaryArray));
		
		
		
		for(int i = 0; i < binaryArray.length; i++) {
			
			System.out.printf("%d", binaryArray[i]);
			if( i % 8 == 7)	System.out.print(" ");
		}
		
		
	}

}
