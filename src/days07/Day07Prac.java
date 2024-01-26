package days07;

import java.util.Scanner;

public class Day07Prac {

	public static void main(String[] args) {

		int sum = 0;
		boolean sw = false;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf(sw ? "%d+" : "%d-", i);
			sum +=  sw ? -i : i;
			sw = !sw;
		}
		
		System.out.printf("=%d", sum);
		
	}

}
