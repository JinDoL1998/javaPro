package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 31. - 오전 10:49:56
 * @subject	현재는 오름차순 -> 내림차순으로 변경
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 로또
		// Syntax error, insert "Dimensions" to complete ReferenceType
		int gameNumber = 5;
		HashSet<Integer> lottoSet = null;
		ArrayList<HashSet<Integer>> lottoList = new ArrayList<>();
		
		// 입력
		int lottoNumber = 0;
		for(int i = 0; i < gameNumber; i++) {
			lottoSet = new HashSet<>();
			while(lottoSet.size() < 6) {
				lottoNumber = (int)(Math.random()*45)+1;
				lottoSet.add(lottoNumber);
			}
			lottoList.add(lottoSet);
		}
		
		// 출력
		int count = 1;
		Iterator<HashSet<Integer>> ir = lottoList.iterator();
		// Collections.sort(List<T> list);
		// LinkedList<Integer> list = null;
		ArrayList<Integer> list = null;
		while (ir.hasNext()) {
			lottoSet = ir.next();	// HashSet
			
			list = new ArrayList<Integer>(lottoSet);
			Collections.sort(list, Collections.reverseOrder());
			
			System.out.printf("%d게임 : ", count++);
					
			Iterator<Integer> ir2 = list.iterator();
			while (ir2.hasNext()) {
				lottoNumber = ir2.next();
				System.out.printf("[%02d]", lottoNumber);		
			}
			System.out.println();
		}
		
	} // main


} // class
