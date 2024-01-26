package days08;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		
		// [로또]
		// Lotto 6/45
		// `~45 임의의 정수 - 6개
		
		/*
		for (int i = 1; i <= 6; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
		*/
		
		// [java.util.Random클래스]
		Random rnd = new Random();
		for(int i = 0; i < 6; i++) {
			int lottoNumber = rnd.nextInt(45) + 1;
			System.out.println(lottoNumber);
		}
		System.out.println("end");
		
	}

}
