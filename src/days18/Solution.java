package days18;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		// 입력 6 => 6개 입력받음
		// 6
		// 5 4 4 2 2 8 입력
		// -> 젤 짧은 2로 스틱 자름
		// 0. 5 4 4 2 2 8   6
		// 1. 3 2 2 0 0 6   4
		// 2. 1 0 0 0 0 4   2
		// 3. 0 0 0 0 0 2   1
		// 4. 0 0 0 0 0 0    0

		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		String input = scanner.next();
		String regex = "1000|^[0-9]{1,3}$";

		if(input.matches(regex)) {
			n = Integer.parseInt(input);
		}
		else throw new InputMismatchException("입력 범위 오류! 1 ~ 1000 정수 입력");

		int[] stickCount = new int[n];
		System.out.print("막대기 길이 입력 : ");
		for(int i = 0; i < n; i++) {
			stickCount[i] = scanner.nextInt();
		}

		cutOperation(n, stickCount);

	}

	private static void cutOperation(int n, int[] stickCount) {


		int minValue = Arrays.stream(stickCount).min().orElse(0);

		int count = 1;

		// --- 첫번쨰 열 출력
		System.out.print(count + ". ");
		for (int i = 0; i < 6; i++) {
			System.out.print(stickCount[i] + " ");
		}

		int nonZeroCount = 0;

		for (int i = 0; i < 6; i++) {
			if (stickCount[i] != 0) {
				nonZeroCount++;
			}
		}
		System.out.print(nonZeroCount);
		System.out.println();

		while(!valuesZero(stickCount)) {


			for(int i = 0; i < n; i++) {
				if(stickCount[i] > 1) stickCount[i] -= minValue;
				else if(stickCount[i] == 1) stickCount[i] -= 1; 

			}

			// --- 두번째 열 이후 조건까지 반복 출력
			System.out.print(count+1 + ". ");
			for (int i = 0; i < 6; i++) {
				System.out.print(stickCount[i] + " ");
			}

			nonZeroCount = 0;

			for (int i = 0; i < 6; i++) {
				if (stickCount[i] != 0) {
					nonZeroCount++;
				}
			}
			System.out.print(nonZeroCount);

			System.out.println();



			count++;
		}



	}

	private static boolean valuesZero(int[] stickCount) {

		for(int value : stickCount) {
			if(value != 0)  return false;
		}

		return true;
	}

}