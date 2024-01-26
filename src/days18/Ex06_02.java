package days18;

/**
 * @author jinseong
 * @date 2024. 1. 24. - 오후 4:31:54
 * @subject	왜 꼭 문자열을 변경(수정)이 일어날때는
 * @content	String 클래스보다 StringBuffer, StringBuilder를 사용해야하는지?
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		testString();
		testStringBuilder();
		
	} // main

	private static void testStringBuilder() {
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
		for(int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.nanoTime();
		System.out.printf("> StringBuilder 처리시간 : %dns\n", (end - start));
	}

	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for(int i = 0; i < 200000; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		System.out.printf("> String 처리시간 : %dns\n", (end - start));
		
	}

} // class
