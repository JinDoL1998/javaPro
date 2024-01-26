package days13;

import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {

		int [][] m = new int[5][5];

		// 골뱅이
		whelkSum(m);

		// squareSum(m);

		// 마방진
		// magicSquare(m);

		// fillM01(m);
		// fillM02(m);
		// fillM03(m);
		// fillM04(m);



		dispM(m);



	} // main


	// [골뱅이]
	/*
	 * [01][02][03][04][05]	
	 * [16][17][18][19][06]
	 * [15][24][25][20][07]
	 * [14][23][22][21][08]
	 * [13][12][11][10][09]
	 */
	private static void whelkSum(int[][] m) {

		int value = 1;
		
		int top = 0;		// 0행 부터 밑으로
		int bottom = 4;		// 4행 부터 위로
		int left = 0;		// 0열부터 오른쪽으로
		int right = 4;		// 4열부터 왼쪽으로

		while (value <= 25) {
			
			// left -> right
			for (int i = left; i <= right; i++) {
				m[top][i] = value++;
			}
			top++;
			
			// top -> bot
			for (int i = top; i <= bottom; i++) {
				m[i][right] = value++;
			}
			right--;
			
			// right -> left
			for (int i = right; i >= left; i--) {
				m[bottom][i] = value++;
			}
			bottom--;
			
			// bottom -> top
			for (int i = bottom; i >= top; i--) {
				m[i][left] = value++;
			}
			left++;
	
		}




	} // whelkSum

	//	[01][02][03][04][10]
	//	[05][06][07][08][26]
	//	[09][10][11][12][42]
	//	[13][14][15][16][58]
	//	[28][32][36][40][136] -
	private static void squareSum(int[][] m) {
		int num = 0;

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = m.length * i + j + 1;


					num+=m[i][j];
					m[i][4] = num;
				

				//				else if(i % 4 == 0) {
				//					num+=m[i][j];
				//					// 00 10 20 30
				//					// 01 11 21 31
				//					// 02 12 22 32
				//					// 03 13 23 33
				//					m[4][j] = num;
				//				}
			}

		}
	}


	//홀수차 마방진
	private static void magicSquare(int[][] m) { 
		// 1) 첫번째 행의 가운데 열 1
		// 2) 출력한 값이 5의 배수 O => 행만 증가  i + 1
		//						   X => 행감소 열 증가 i -1, j + 1
		//								ㄴ 행 벗어나는 경우 - 가장 큰 행의 값으로 설정 
		//								ㄴ 열 벗어나는 경우 - 가장 작은 열의 값으로 설정

		int squareSize = 5 * 5;
		int value = 1;
		int row = 0, col = 2;

		while(value <= 25){

			m[row][col] = value;
			dispM(m);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(value % 5 != 0) {
				row--;
				col++;

				if( col == 5 ) col = 0;
				else if( row == -1) row = 4;

			}

			else {
				row++;

			}

			value++;
		}



	}

	private static void fillM04(int[][] m) {

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {

				m[i][i%2 == 0 ? j : 4-j] = m.length * i + j + 1;

			}
		}
	}

	/*
	private static void fillM04(int[][] m) {

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {

//				if((i % 2 == 0)) m[i][j] = m.length * i + j + 1;
//				else m[i][j] = (i+1) * 5 - j;
				m[i][j] = i % 2 == 0 ? (m.length * i + j + 1) : ((i+1) * m.length - j);

			}
		}

	}
	 */

	private static void fillM03(int[][] m) {

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = (m.length-i) + m.length*j;
			}
		}

	}

	/* [1]
	private static void fillM03(int[][] m) {

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[4-j][i] = 5 * i + j + 1;
			}
		}

	}
	 */

	private static void fillM02(int[][] m) {
		for (int i = m.length-1; i >= 0 ; i--) {
			for (int j = m[i].length-1 ; j >= 0 ; j--) {
				m[i][j] = 5 * i + j + 1;
			}

		}


	}

	/*[2]
	private static void fillM01(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5 * i + j + 1;
			}

		}

	}
	 */

	/*[1]
	private static void fillM01(int[][] m) {
		for (int i = 0, value = 1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++, value++) {
				m[i][j] = value;
			}

		}

	}
	 */


	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}

	}

} // class
