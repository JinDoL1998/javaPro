package days07;

public class Ex03 {

	public static void main(String[] args) {

		// [8]
		for (int i = 1; i <= 3; i++) {
			for (int j = 1 ; j <= 5; j++ ) {
				
				// System.out.print(i+j>=4 ? "*" : "_");
				// System.out.print(j-i<=2 ? "*" : "_");
				System.out.print(i+j>=4 && j-i<=2 ? "*" : "_");
				
			}
			System.out.println();
		}
		
		// [7]			공백	별
		/*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1 ; j <= 5; j++ ) {
				
				// if(i==j) System.out.print("*");
				// else System.out.print("_");
				// System.out.print(i==j ? "*" : "_");
				// System.out.print(i+j==6 ? "*" : "_");
				System.out.print(i+j==6 || i==j ? "*" : "_");
				
			}
			System.out.println();
		}
		*/

		// [6]			공백	별
		//   *	 	i=1 j=0		1
		//  ***	 	i=2 j=1		3
		// *****	i=3 j=2		5

		/*
		for (int i = 1; i <= 3 ; i++) {
			for (int j = 1 ; j <= 3 - i; j++ ) {
				System.out.print("_");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */


		// [5]
		// ****	 i=1 j=0
		//  ***	 i=2 j=1
		//   **	 i=3 j=2
		//    *	 i=4 j=3
		/*
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 1 ; j <= i - 1; j++ ) {
				System.out.print("_");
			}
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
	
		// [4]
		 
		/*
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 1 ; j <= 4 - i; j++ ) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */
		
		/*
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 1 ; j <= 4; j++ ) {
				System.out.print(i+j >= 5 ? "*" : "-");
			}
			System.out.println();
		}
		*/

		/* [3]
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 0 ; j < 5-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */

		// [2]
		/*
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 0 ; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */

		/* [1]
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 0 ; j < 4; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */

		/*
		for (int i = 1; i <= 4 ; i++) {
			System.out.println("*".repeat(i));
		}
		 */

	}

}
