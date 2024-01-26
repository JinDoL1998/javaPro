package days20;

import java.text.DecimalFormat;

/**
 * @author jinseong
 * @date 2024. 1. 26. - 오후 2:26:23
 * @subject	[형식화 클래스 4가지]
 * @content	SimpleDateFormat ***
 * 			DecimalFormat
 * 			ChoiceFormat
 * 			MessageFormat
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// [Decimal Format]
		//   숫자	형식화하는 클래스
		
		// int money = 3257650;
		double money = 3257600.8;
		String strMoney = money + "";
		
		// [3] DecimalFormat 숫자 -> 형식화 클래스
		// String pattern = "#,###.00";
		String pattern = "#,###.##";
		// String pattern = "\u00A4#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String result = df.format(money);
		System.out.println(result);
		
		
		/* [1]
		for(int i = 0; i < strMoney.length(); i++) {
			System.out.print(strMoney.charAt(i));
			if(strMoney.length() % 3 == 0) { 
				if(i%3 ==2 ) System.out.print(",");
			}
			else if(strMoney.length() % 3 == 1) { 
				if(i%3 == 0 ) System.out.print(",");
			}
			else if(strMoney.length() % 3 == 2) { 
				if(i%3 == 1 ) System.out.print(",");
			}
		}
		*/
		
		/* [2]
		int moneyLength = strMoney.length();
		String result = "";
		
		for(int i = 0; i < moneyLength; i++) {
			char one = strMoney.charAt(i);
			int placeValue = moneyLength - i;
			// System.out.println(one + " " + placeValue);
			result += one;
			// if(placeValue != 1 && placeValue % 3 == 1) result += ",";
			if(placeValue % 3 == 1) result += ",";
			
		}
		System.out.println(result);
		System.out.println(result.substring(0, result.length()-1));
		*/
		
		/*
		String result = String.format("%,d", money);
		System.out.println(result);
		*/
		
		// 출력 형식 : 3,257,600
		
	} // main

} // class
