package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오후 5:12:09
 * @subject
 * @content	
 */
public class Ex09 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
		
		// 소수점 4번째 자리에서 반올림한 실수값을 얻어오고 싶다.
		
		String s_pi = String.format("%.3f", pi);
		
		float pi4 = Float.parseFloat(s_pi);
		
		System.out.println(pi4);
		
		// 2번쨰 풀이
		int i_pi = (int) (pi * 1000 + 0.5);		// 3142.092
		int fNum = (int) (pi * 100 + 0.5);
		System.out.println( (float) i_pi / 1000 );
		System.out.println((double) fNum / 100);
		
	}

}
