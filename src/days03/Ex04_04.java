package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오후 2:39:21
 * @subject 비트논리연산자
 * @content	& ^ | ~
 */

public class Ex04_04 {

	public static void main(String[] args) {
		
		/*
		System.out.println(3);
		System.out.println(Integer.toBinaryString(3));
		System.out.printf("%08d\n", Integer.toBinaryString(3));
		
		String binaryStr = Integer.toBinaryString(3);
		
		System.out.printf("%08d\n", Integer.parseInt(binaryStr));
		*/
		
		//				0000 0011
		System.out.println( 3 );
		
		//				0000 0001
		System.out.println( 1 );
		
		// & 비트 논리 AND 연산자
		// 상응되는 비트 값을 비교
		// 00000011
		// 00000001
		// 1 & 1	1
		// 1 & 0	0
		// 0 & 1	0
		// 0 & 0	0

		// 1 | 1	1
		// 1 | 0	1
		// 0 | 1	1
		// 0 | 0	0
		
		// ^ : XOR연산자 : eXclusive OR 연산자
		//				   배타적인
		// 1 ^ 1	0
		// 1 ^ 0	1
		// 0 ^ 1	1
		// 0 ^ 0	0
		
		System.out.println(3 & 1);	// 1
		System.out.println(3 | 1);	// 3
		System.out.println(3 ^ 1);	// 2
		
		// ~ 틸드 연산자
		// 1 => 0
		// 0 => 1
		System.out.println( ~3 );	// 1111 1100
		// 1111 1100
		//		   1
		// 1111 1011
		// 0000 0100
		// 		  -4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
