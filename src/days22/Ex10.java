package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		/*
		HashSet  lotto = new HashSet();
		lotto.add(10);
		lotto.add(10);
		lotto.add(10);
		lotto.add(10);
		lotto.add(15);
		lotto.add(45);
		lotto.add(45);
		lotto.add(20);
		lotto.add(8);
		lotto.add(45);
		lotto.add(32);

		System.out.println(lotto);
		 */
		
		// 로또
		// 로또 게임 횟수 입력 (n) 
		
		
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임 횟수 입력 : ");
		gameNumber = scanner.nextInt();
		
		ArrayList lottos = new ArrayList();
		HashSet lotto = null;
		
		for(int i = 0; i < gameNumber; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		
		System.out.println("================");
		dispLottos(lottos);

	} // main

	private static void dispLottos(ArrayList lottos) {
		
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			HashSet lotto = (HashSet) ir.next();
			Iterator ir2 = lotto.iterator();
			while (ir2.hasNext()) {
				int lottoNumber = (int) ir2.next();
				System.out.printf("[%d]", lottoNumber);
				
			}
			System.out.println();
		}
		
	}

	private static void fillLotto(HashSet lotto) {
		
		Random random = new Random();
		while(lotto.size() < 6) {
			int lottoNumber = random.nextInt(45)+1;
			// System.out.println(lottoNumber);
			lotto.add(lottoNumber);
		}
		
	}


} // class
