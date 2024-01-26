package days06;

import java.util.Arrays;
import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 12:02:33
 * @subject
 * @content	
 */
public class Ex02_01 {

	public static void main(String[] args) {

		// [람다식과 스트림] 설명
		int[] m = new Random().ints(5,16).limit(10).toArray();
		
		Arrays.toString(m);
		System.out.println(Arrays.toString(m));
		
		int max = new Random().ints(5,16).limit(10).max().getAsInt();
		
		
	}

}
