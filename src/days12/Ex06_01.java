package days12;

import java.util.Random;

public class Ex06_01 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) 
		
		int n = 3;

//		int[][] lotto = new int[n][6]; 
//		
//		for(int i = 0 ; i < lotto.length; i++) {
//			fillLotto(lotto[i]);
//		}
//
//		for(int i = 0; i < lotto.length; i++) {
//			
//			dispLotto(lotto[i]);
//		}


	}


	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index, int n) {

		for(int i = (6 * n); i < index; i++) {
			if(lottoNumber == lotto[i]) return true;
		}

		return false;
	}
}
