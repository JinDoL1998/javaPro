package days07;

public class Ex08 {

	public static void main(String[] args) {
		
		// 계차 수열
		// 항의 개수가 20개까지의 합
		// 1 2 4 7 11 16 22 29 37 46 56 67
		int sum = 0;
		int term = 1;
		int defference = 0;
		for (int i = 1; i <= 20; i++) {
			term += defference;
			System.out.printf("%d+", term);
			defference++;
			sum+= term;
		}
		System.out.printf("=%d\n",sum);
		
		
		/*
		// (n^2-n)/2 + 1
		for(int i = 1; i <= 20; i++) {
			term = (int)((Math.pow(i,2)-1)/2+1);
			System.out.printf("%d+", term);
		}
		*/
		
		
	}

}
