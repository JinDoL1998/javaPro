package days12;

/**
 * @author jinseong
 * @date 2024. 1. 16. - 오전 10:29:22
 * @subject
 * @content	
 */
public class Ex02_01 {

	public static void main(String[] args) {
		/*
		// 2행 4열 2차원배열
		int [][] m = new int[2][4];
		// 2차원 배열 = 1차원 배열의 배열이다. (그림)

		System.out.println(m.length);		// 2 행 갯수
		System.out.println(m[0].length);	// 4 0행의 열갯수
		System.out.println(m[1].length);	// 4 1행의 열갯수
		 */

		// 2행 4열 2차원배열 초기화

		/*
		int [][] m = new int[][] {
								{1,2,3,4},
								{5,6,7,8}
								};
		 */					
		int [][] m = {
				{1,2,3,4},
				{5,6,7,8}
		};

		dispM(m);	// 2차원 배열의 매개변수 사용

	}

	private static void dispM(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			}
			System.out.println();
		}
	}

}
