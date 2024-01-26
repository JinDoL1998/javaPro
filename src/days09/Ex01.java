package days09;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 11. - 오전 10:26:55
 * @subject
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) 
		int n = 3;

		int[] lotto = new int[n*6];

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

		/*
		lotto[0] = lottoNumber;
		
		while(index <= 17) {
			
			lottoNumber = random.nextInt(45) + 1;
			//5 / 6 7 8 9 10 11 /12 13 14 15 16 17
			if ( index % 6 == 0 || index == 1) { 
				if (!isDuplicateLotto(lotto, lottoNumber, index))
					lotto[index++] = lottoNumber;
			}
		}
		*/

		
		lotto[0] = lottoNumber;

		while(index <= 5) {

			lottoNumber = random.nextInt(45) + 1;

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