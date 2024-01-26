package days04;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 4. - 오후 2:21:10
 * @subject	
 * @content	
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		int n;
		
		try(Scanner scanner = new Scanner(System.in);) {
			
			System.out.print("정수 n 입력 : ");
			n = scanner.nextInt();
			String result = "홀수";
			
			if (n % 2 == 0) result = "짝수";
			
			System.out.println(result);
			
		} catch (Exception e) {
			
			
		}
		
		
		
		
	}

}
