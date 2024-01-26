package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day11Test {

	public static void main(String[] args) {

		int [] m = new int [50]; 
		
		m = new Random().ints(m.length, 1, 30).toArray();

		System.out.println(Arrays.toString(m));
		
		int findNumber;
		int beginIndex = 0;
		int foundIndex;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("찾을 정수 입력 : ");
		findNumber = scanner.nextInt();
		
		
		while((foundIndex = sequentialSearch(m, findNumber, beginIndex)) != -1) {
			
			System.out.println(foundIndex);
			beginIndex = foundIndex + 1;
		}
		
		if (foundIndex == -1) {
			System.out.println("찾는 값이 없습니다.");
		}
		
		
	}

	private static int sequentialSearch(int[] m, int findNumber, int beginIndex) {

		for (int i = beginIndex; i < m.length; i++) {
			if(m[i] == findNumber) {
				return i;
			}
		}

		
		return -1;
	} 


}// class
