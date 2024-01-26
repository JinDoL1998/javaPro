package days05;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오전 11:32:35
 * @subject
 * @content	
 */
public class Ex03_01 {

	public static void main(String[] args) {
		
		// 입의의 수를 발생시키는 방법
		// 0.0 <= double < 1.0
		
		for (int i = 0; i < 1000; i++) {
			System.out.println((int) (Math.random() * 3) + 1);
		}
		
		// 1~3 임의ㅡ이 정수 필요
		// 0.0 * 3 <= double Math.random() * 3 < 1.0 * 3
		
	}

}
