package days02;

import java.util.Calendar;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오후 3:04:34
 * @subject
 * @content	
 */
public class Ex07_01 {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.printf("%d\t%o\t%x\t%X\n", i, i, i, i);
		System.out.printf("%1$d\t%1$o\t%1$x\t%1$X\n", i);
		System.out.printf("%1$d\t%1$#o\t%1$#x\t%1$#X\n", i);
		
		// 날짜 클래스 
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tY - %1$tm - %1$te\n", c);
		
		// 출력서식 사용할 때 형식(문법)
		//  %[argument_index$][flags][width][.precision]conversion
		boolean gender = true;
		System.out.printf("%b \n", gender);
		
		int total = 277;
		double avg = 92.333333333333;
		System.out.printf("총점 : [%10d] \n", total);
		System.out.printf("총점 : [%-10d] \n", total);
		
		System.out.printf("평균 : [%10.2f] \n", avg);
		
		int money = 123456;
		System.out.printf("머니 : %,d \n", money);
		
		int no = 15;
		System.out.printf("NO : [%04d] \n", no);
		
		
	}

}
