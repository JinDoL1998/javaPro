package days09;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 11. - 오전 10:26:55
 * @subject
 * @content	
 */
public class Ex01_01 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) 
		int n = 3;

		int[] lotto = new int[n*6];
		
		for(int i = 0 ; i < n; i++) {
			fillLotto(lotto, i);
		}

		dispLotto(lotto);


	}

	private static void dispLotto(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]", i, lotto[i]);
			if(i % 6 == 5) System.out.println();
		}

	} // dispLotto

	private static void fillLotto(int[] lotto, int i) {

		Random random = new Random();

		int index = 6 * i + 1;
		int lottoNumber = random.nextInt(45) + 1;
	
		lotto[6*i] = lottoNumber;
		System.out.printf("[%d]", lottoNumber);

		while(index <= 6 * i + 5) {

			lottoNumber = random.nextInt(45) + 1;
			System.out.printf("[%d]", lottoNumber);
			
			
			if (!isDuplicateLotto(lotto, lottoNumber, index, i))
				lotto[index++] = lottoNumber;
		}
		
		System.out.println();

	}	// fillLotto

	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index, int n) {

		for(int i = (6 * n); i < index; i++) {
			if(lottoNumber == lotto[i]) return true;
		}

		return false;
	}



} // class