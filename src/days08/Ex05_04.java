package days08;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오후 2:29:24
 * @subject
 * @content	
 */
public class Ex05_04 {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		fillLotto(lotto);

		dispLotto(lotto);


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

		
		while(index <= 5) {
			
			lottoNumber = random.nextInt(45) + 1;
			System.out.println(lottoNumber);
			
			if (!isDuplicateLotto(lotto, lottoNumber, index))
				lotto[index++] = lottoNumber;
		}
			
	}	// fillLotto

	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		
		for(int i = 0; i < index; i++) {
			if(lottoNumber == lotto[i]) return true;
		}
		
		return false;
	}
	
	

} // class
