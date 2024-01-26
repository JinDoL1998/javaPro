package days20;

import java.text.DecimalFormat;

public class Ex04_01 {

	public static void main(String[] args) {
		
		String strMoney = "3,257,600.80";
		double money;
		
		// [2] DecimalFormat 형식화 클래스
		// 		ㄴ format()
		//		ㄴ parse() 파싱
		String pattern = "#,###,00";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			// Number -> int, double 변환
			money = n.doubleValue();
			System.out.println(money);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		strMoney = strMoney.replace(',', '\u0000');
		money = Double.parseDouble(strMoney);
		System.out.println(money);	// 3257600.8
		*/
		
		
	}

}
