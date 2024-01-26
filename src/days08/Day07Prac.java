package days08;

import java.util.Random;
import java.util.Scanner;

public class Day07Prac {

	public static void main(String[] args) {
		
		// 기억공간의 값 교환(Ex02), 재귀함수(Ex04), 
		// 윤년(Ex03), 로또(Ex05), 주민번호(Ex06)
		
//		int [] lotto = new int[6];
//		
//		getLotto(lotto);
//		
//		printLotto(lotto);
		
//		int [] year = new int[21];
//		for(int i = 0; i < year.length; i++) {
//			year[i] = 2010+i;
//		}
//		
//		boolean result;
//		
//		
//		result = leapYear(year);
//		
//		for(int i = 0 ; i < year.length; i++) {
//			
//			System.out.printf("%d = %b\n", year[i], result);
//		}
		
//		int money;
//		int count = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("돈 입력 : ");
//		money = scanner.nextInt();
//		
//		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		String [] sunit = {"5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };
//		
//		for(int i = 0; i < unit.length; i++) {
//			count = money/unit[i];
//			System.out.printf("%s : %d개\n", sunit[i], count);
//			money %= unit[i]; 
//		}
		
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = scanner.nextInt();
		
		String binaryNum = Integer.toBinaryString(num);
		System.out.println(binaryNum);
		System.out.println("00000000 00000000 00000000 0000"+binaryNum);
		

		
	} // main
	
	

	
	
	private static boolean leapYear(int[] year) {
		for(int i = 0; i < year.length; i++) {
			if(year[i] % 4 == 0) return true;
				
		}
		return false;
		
	}





	private static void printLotto(int[] lotto) {
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.printf("%d, ", lotto[i]);
		}
		
	}



	private static void getLotto(int[] lotto) {
		
		Random random = new Random();
		
		int index = 1;
		
		int lottoNumber = random.nextInt(45) + 1;
		
		lotto[0] = lottoNumber;
		
		while(index <= 5) {
			lottoNumber = random.nextInt(45) + 1;
			
			if(!isDuplicateLotto(lotto, lottoNumber, index)) {
				lotto[index++] = lottoNumber;
			}
		
			
		}
	}



	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		
		for(int i = 0; i < index; i++) {
			if(lottoNumber == lotto[i]) return true;
		}
		
		return false;
	}



	private static int recursiveFactorial(int num) {
		
		if(num == 0 || num == 1) return 1;
		
		else return num * recursiveFactorial(num - 1);
		
	}
}
