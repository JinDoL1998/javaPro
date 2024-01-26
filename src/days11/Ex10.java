package days11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex10 {

	public static void main(String[] args) {

		// 정렬 (Sort)		- 일정한 순서로 다시 배열하는 것
		// 오름차순 정렬
		// 내림차순 정렬


		// 정렬 방법 - 시험
		// 1) 버블 정렬( bubble sort )
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		// bubbleSort(m);
		// System.out.println(Arrays.toString(m));

		// 2) 선택 정렬
		// selectionSort(m);
		selectionSort2(m);
		System.out.println(Arrays.toString(m));
		// 3) 삽입 정렬
		// 4) 병합 정렬

	}
	
	// 시험
	private static void selectionSort2(int[] m) {
		
		/*
		int minNumber = 0;
		
		for(int i = 0; i < m.length-1; i++) {
			minNumber = m[i];
			for(int j = i+1; j < m.length; j++) {
				if(m[j] < minNumber) minNumber = m[j];
				
				if(m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		*/
		
		for(int i = 0; i < m.length-1; i++) {
			int minIndex = i;
			
			for(int j = i+1; j < m.length; j++) {
				if(m[minIndex] > m[j]) minIndex = j;	
			}
			
			if(minIndex == i) continue;
			
			int temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
		}
		System.out.println();
		
	}

	// 선택정렬
	// 0
	private static void selectionSort(int[] m) {
		
		for(int i = 0; i < m.length-1; i++) {
			for(int j = i+1; j < m.length; j++) {
				if(m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
	}
	
	
	// 버블정렬 오름차순 정렬
	private static void bubbleSort(int[] m) {
		
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.printf("%d-%d", j-1, j);
				if(m[j-1] > m[j]) {
					System.out.print("***");
					int temp = m[j-1];
					m[j-1] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}
		
		
	}

}
