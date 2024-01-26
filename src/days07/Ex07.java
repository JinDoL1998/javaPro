package days07;

/**
 * @author jinseong
 * @date 2024. 1. 9. - 오후 2:34:46
 * @subject
 * @content	
 */
public class Ex07 {

	public static void main(String[] args) {

		// [피보나치 수열]
		// 항(term)
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 +...

		int firstTerm = 1;
		int secondTerm = 1;		
		int nextTerm;

		int sum = firstTerm + secondTerm;
		System.out.printf("%d + %d + ", firstTerm, secondTerm);

		/* [2]
		while( true ) {

			nextTerm = firstTerm + secondTerm;

			if(nextTerm > 100) break;

			sum += nextTerm;
			System.out.printf("%d + ", nextTerm);

			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}
		System.out.printf("=%d\n", sum);
		 */

		while( (nextTerm = firstTerm + secondTerm) <= 100 ) {

			sum += nextTerm;
			System.out.printf("%d + ", nextTerm);

			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}
		System.out.printf("=%d\n", sum);

	}

}
