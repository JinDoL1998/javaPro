package days03;

/**
 * @author jinseong
 * @date 2024. 1. 3. - 오후 3:50:35
 * @subject
 * @content	
 */

public class Ex06_02 {

	public static void main(String[] args) {

		// 증감연산자		++	--
		// 복합대입연산자	+=	-=

		int x = 10;

		// x++	후위형 증감연산자
		++x; // 전위형 증감연산자

		// int t = x++;
		int y = ++x;

		System.out.printf("> x=%d, y=%d\n", x, y);

		int n = 100;
		// System.out.println( ++n == 100 );		// 101 == 100
		System.out.println( n++ == 100 );	// 100 == 100

		System.out.println(n);		// 101

	}

}
