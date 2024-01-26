package days12;

public class Ex04 {

	public static void main(String[] args) {
		
		// 1차원 배열 -> 2차원 배열 옮기는 코딩
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		dispM(m);
		
		// 2차원 배열 -> 1차원 배열 옮기는 코딩
		int[][] n = new int[3][4];
		int row = n.length;
		int col = n[0].length;
//		dispM(n);
		
//		1 	2 	3 	4 	
//		0 0 0 1 0 2 0 3 
//		
//		5 	6 	7 	8 
//		1 0 1 1 1 2 1 3
//		
//		9 	10	 11	 12 
//		2 1  2 2  2 3 
		
		// 1차원 배열 -> 2차원 배열 옮기는 코딩
		for(int i = 0; i < m.length; i++) {
			n[i/col][i%col] = m[i];
		}
		
		
		
		dispM(n);
		
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
			System.out.printf("m[%d]=%d", i, m[i]);
		}
		System.out.println();
		
	}

}
