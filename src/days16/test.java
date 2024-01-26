package days16;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//        String my_string;
		//        my_string = sc.next();
		//        String overwrite_string;
		//        overwrite_string = sc.next();
//		String my_string = "He11oWor1d";
//		String overwrite_string = "lloWorl";
//		int s = 2;
		
		String my_string = "Program29b8UYP";
		String overwrite_string = "merS123";
		int s = 7;
		
		//        s = sc.nextInt();

		String answer = solution(my_string, overwrite_string, s);
		System.out.println(answer);

	}
	
	// 좋지 않은 코딩 다시 작성해볼것.
	private static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";

		char[] myArr = my_string.toCharArray();  // "HelloWorl1d
		char[] overwriteArr = overwrite_string.toCharArray(); //"lloWorl"
		
		
		//                ㄴs 2
		/*
		 * for(int i = 0; i < my_string.length(); i++) { if(i >= s) myArr[i] =
		 * overwriteArr[i-s]; }
		 */
		
		for(int i = 0; i < overwriteArr.length ; i++) {
			  myArr[i+s] = overwriteArr[i];
		}

		answer = String.valueOf(myArr);

		return answer;
	}
	// 10 7 2
	// 14 7 7



}
