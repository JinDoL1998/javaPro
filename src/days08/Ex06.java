package days08;

import java.util.Random;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오후 4:02:23
 * @subject
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// 신용카드
		String card = "7654-1548-4576-3184";
		String regex = "-";
		String [] cardArr = card.split(regex);
		

		for (String c : cardArr) {
			System.out.println(c);
			
		}

		
		Random random = new Random();
		int index = random.nextInt(4);
		
		cardArr[index] = "****";
		
		// String.join()
		String printCard = String.join("-", cardArr);
		
		System.out.println(printCard);
		
		/*
		String printCard = String.format("%s-%s-%s-%s", cardArr[0], cardArr[1], cardArr[2], cardArr[3]))
		*/

	System.out.println();
		
		
		// 카드결재 영수증
		/*
		 * 7654-****-4576-3184
		 * 7654-1548-4576-****
		 * ****-1548-4576-3184
		 * 7654-1548-****-3184 
		 */
		
	}

}
