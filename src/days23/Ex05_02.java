package days23;

import java.util.Arrays;
import java.util.TreeSet;

public class Ex05_02 {

	public static void main(String[] args) {
		
		int[] score = {80,95,50,85,45,65,10,100};
		// 1) 80보다 큰 점수를 얻어와서 출력
		
		// int[] -> TreeSet<Integer> 변환
		
		Integer[] scoreArray = Arrays.stream(score).boxed().toArray(Integer[]::new);
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(scoreArray));
		
		
		
		/*
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		}
		*/
		
		// 지정된 값보다 작은 값의 객체를 반환하는 메서드
		// ts.headSet(null);
		
		// 지정된 값보다 큰 값의 객체를 반환하는 메서드
		// System.out.println(ts.tailSet(80));		 // [80, 85, 95, 100]
		// System.out.println(ts.tailSet(80, true)); // [80, 85, 95, 100]
		System.out.println(ts.tailSet(80, false));	// [85, 95, 100]
		
		
		
	} // main

}
