package days06;

import java.io.IOException;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 2:05:45
 * @subject
 * @content	
 */
public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		
		char one, con;
		int code;
				
		do {
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			one = (char)code;
			
			System.out.printf("%c\n", one);
			System.in.skip(System.in.available());
			
			
			System.out.print("\n\n continue? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.println("end");

	}

}
