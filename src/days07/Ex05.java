package days07;

public class Ex05 {

	public static void main(String[] args) {

		// [순서도]
		// 워크플로 혹은 프로세스를 보여주는 다이어그램의 한 종류

		int sum = 0;
		// 스위칭 변수
		boolean sw = false;
		
		/* [1]
		for(int i = 1; i <= 10; i++) {

			if(i % 2 != 0) sum += i;

			if(i % 2 == 0) sum -= i;

			System.out.printf(i % 2 == 0 ? "%d+" : "%d-", i );
		}
		 */

		/* [2]
		for(int i = 1; i <= 10; i++) {

			sum += (i % 2 == 0) ? -i : i;

			System.out.printf(i % 2 == 0 ? "%d+" : "%d-", i );
		}
		 */

		/*
		// [3] 스위칭 변수 사용(기억)
		for(int i = 1; i <= 10; i++) {

			if(sw) {
				sum += i;
				System.out.printf("%d+",i);
			}
			else {
				sum -= i;
				System.out.printf("%d-",i);
			}
			
			sw = !sw;
		}
		*/
		
		for(int i = 1; i <= 10; i++) {

			System.out.printf(sw ? "%d+" : "%d-",i);
			sum +=  sw? -i: i;
			sw = !sw;
		}

		System.out.printf("= %d ", sum);


	}

}
