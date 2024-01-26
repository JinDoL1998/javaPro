package days12;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 16. - 오후 12:34:00
 * @subject
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {
		// 로또 게임 횟수 입력 (n) 
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("로또 수행 횟수 입력 : ");
		n = scanner.nextInt();

		int[][] lotto = new int[n][6];	// 5행 6열 2차원배열

		for(int i = 0 ; i < lotto.length; i++) {
			for(int j = 0; j < lotto[i].length; j++) {
				fillLotto(lotto, i, j);
			}
		}

		dispLotto(lotto);


	}

	private static void dispLotto(int[][] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto[i].length; j++) {
				System.out.printf("lotto[%d][%d] = %d ", i, j, lotto[i][j]);
			}
			System.out.println();
		}

	} // dispLotto

	private static void fillLotto(int[][] lotto, int row, int col) {

		Random random = new Random();
		
		for(row = 0; row < lotto.length; row++) {
			for(col = 0; col < lotto[row].length; col++) {
				int lottoNumber = random.nextInt(45) + 1;
				lotto[row][col] = lottoNumber;
				
				isDuplicateLotto(lotto, lottoNumber, row, col);
			
			}
		}

		

	}	// fillLotto

	private static boolean isDuplicateLotto(int[][] lotto, int lottoNumber, int row, int col) {

		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(lottoNumber == lotto[i][j]) return true;
			}
		}

		return false;
	}



} // class