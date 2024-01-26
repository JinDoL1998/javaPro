package days12;

/**
 * @author jinseong
 * @date 2024. 1. 16. - 오전 10:29:22
 * @subject
 * @content	
 */
public class Ex02_02 {

	public static void main(String[] args) {
		/*
		// 2면 2행 2열 3차원배열
		int [][][] m = new int[2][2][2];
		// 3차원 배열 = 2차원 배열의 배열이다. (그림)

		System.out.println(m.length);		// 2 면 갯수
		
		System.out.println(m[0].length);	// 2 행갯수
		System.out.println(m[1].length);	// 2 행갯수
		
		System.out.println(m[0][0].length);	// 2 열갯수
		System.out.println(m[0][1].length);	// 2 열갯수
		System.out.println(m[1][0].length);	// 2 열갯수
		System.out.println(m[1][1].length);	// 2 열갯수
		
		 */

		
		// 2면 2행 4열 3차원배열 초기화

		int [][][] m = {
							{
							{1,2,3,4},
							{5,6,7,8}
							},
							{
							{11,12,13,14},
							{15,16,17,18}
							}
						};

		dispM(m);	// 2차원 배열의 매개변수 사용

	}

	private static void dispM(int[][][] m) {
		for(int i = 0; i < m.length; i++) {
			System.out.printf("[%d]면\n", i);
			for(int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					
					System.out.printf("m[%d][%d][%d]=%d ", i, j, k, m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
