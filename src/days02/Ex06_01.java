package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jinseong
 * @date 2024. 1. 2. - 오후 2:01:57
 * @subject
 * @content 키보드로부터 나이를 입력받아서 입력받은 나이를 출력	
 */

public class Ex06_01 {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		byte age = 0;
//		
//		System.out.print("나이 입력 : ");
//		age = (byte) br.read();
//		
//		System.out.println("나이 : " + age);
		
		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이 입력 : ");
		// Type mismatch: cannot convert from String to byte
		age = Byte.parseByte(br.readLine()); // "23" -> 숫자(정수) byte 형 변환
		
		System.out.println("나이 : " + age);
		
	}

}
