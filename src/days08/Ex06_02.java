package days08;

import java.util.Arrays;

/**
 * @author jinseong
 * @date 2024. 1. 10. - 오후 4:17:58
 * @subject
 * @content	
 */
public class Ex06_02 {

	public static void main(String[] args) {

		String rrn = "123456-1548651";

		String[] rrnArr = rrn.split("-");
		System.out.println(rrnArr[0]);
		
		System.out.println(rrnArr[1].charAt(0));
		
		String printRRN = rrnArr[0] + "-" + rrnArr[1].charAt(0) + "******";
		System.out.println(printRRN);

		// 주민등록번호를 출력
		// 830412-1******

	}

}
