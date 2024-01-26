package days07;

public class Ex06 {

	public static void main(String[] args) {
		
		double sum = 0;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d/%d +", i, (i+1));
			sum += (double)(i) / (i+1);
		}
		System.out.printf("=%.2f", sum);
		
	}

}
