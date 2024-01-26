package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 12:02:33
 * @subject
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) {

		
		int[] m = new int[10];

		for(int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 11) + 5;

		}
		

		// 추가문제
		// m배열의 가장 큰값, 가장 작은값을 구해서 출력
		int maxNumber = 0, minNumber = m[0];
		
		for(int i = 0; i < m.length; i++) {
			
			maxNumber = Math.max(maxNumber, m[i]);
			
			minNumber = Math.min(minNumber, m[i]);
			
			
			System.out.printf("%d, ", m[i]);
			
		}
		System.out.println();
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d",maxNumber, minNumber);
		
		
		
	}

}
