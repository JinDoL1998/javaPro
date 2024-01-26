package days11;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex06 {

	public static void main(String[] args) {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		double avg;
		
		int sum = m[0];
		int maxNum = m[0];
		int minNum = m[0];
		
		for(int i = 1; i < m.length; i++) {
			
			sum += m[i];
			
			if(m[i] > maxNum) {
				maxNum = m[i];
			}
			
			else if(m[i] < minNum) {
				minNum = m[i];
			}
		}
		avg = (double)sum / m.length;
		
		System.out.printf("최대값 : %d, 최소값 : %d, 합 : %d, 평균 : %.2f\n", maxNum, minNum, sum, avg);
		System.out.println("-".repeat(30));
		
		maxNum = IntStream.of(m).max().getAsInt();
		minNum = IntStream.of(m).min().getAsInt();
		sum = IntStream.of(m).sum();
		avg = IntStream.of(m).average().getAsDouble();
		System.out.printf("최대값 : %d, 최소값 : %d, 합 : %d, 평균 : %.2f\n", maxNum, minNum, sum, avg);
		
		int[] score = new Random().ints(20, 0, 101).toArray();
		
		
		
	}

}
