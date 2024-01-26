package days12;

/**
 * @author jinseong
 * @date 2024. 1. 16. - 오후 12:07:03
 * @subject
 * @content	
 */
public class Ex04_01 {

	public static void main(String[] args) {
	
		// 2차원 배열 -> 1차원 배열 옮기는 코딩
		int [][] n = {
				{1,2,3,4},
				{5,6,7,8}
		};
		dispM(n);
		
		
		/*
		 * 0 0 -> 0
		 * 0 1 -> 1
		 * 0 2 -> 2
		 * 0 3 -> 3
		 * 
		 * 1 0 -> 4
		 * 1 1 -> 5
		 * 1 2 -> 6
		 * 1 3 -> 7
		 * 
		 */
		int row = n.length;
		int col = n[0].length;
		int [] m = new int[row*col];
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				m[(i*4)+(j)] = n[i][j];
			}
		}
		dispM(m);
		
	}

	private static void dispM(int[][] n) {

		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.printf("n[%d][%d]=%d ", i, j, n[i][j]);
			}
			System.out.println();
		}

	}

	private static void dispM(int[] m) {

		for(int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
		System.out.println();

	}

}
