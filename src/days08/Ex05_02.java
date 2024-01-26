package days08;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오후 2:29:24
 * @subject
 * @content	
 */
public class Ex05_02 {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		fillLotto(lotto);

		dispLotto(lotto);

		// [1] [0]
		// [2] [1] / [2] [0]
		// 3 2 / 3 1 / 3 0

	}

	private static void dispLotto(int[] lotto) {
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		}
		
	} // dispLotto

	private static void fillLotto(int[] lotto) {
		Random random = new Random();
		
		int index = 1;
		int lottoNumber = random.nextInt(45) + 1;
		lotto[0] = lottoNumber;
		System.out.println(lottoNumber);
		boolean isDuplicate = false;
		
		while(index <= 5) {
			
			System.out.println(lottoNumber);
			isDuplicate = false;
			
			lottoNumber = random.nextInt(45) + 1;
			
			for(int i = 0; i < index; i++) {
				
				if(lottoNumber == lotto[i]) {
					isDuplicate = true;
					break;
				}
				
			}
			if(!isDuplicate) lotto[index++] = lottoNumber;
			
		}
		
		
	} // fillLotto

} // class
