package days10;

import javax.xml.transform.stream.StreamResult;

public class Ex01_01_01 {

	public static void main(String[] args) {		
		
		// 10진수 정수 => 16진수 출력
		
		//String strHex = "";
		int n = 125;
		
		int remider, share;
		
		String hex = "0123456789ABCDEF";
		StringBuilder stringBuilder = new StringBuilder();
		while(n!=0) {
			share = n / 16;
			remider = n % 16;
			
			stringBuilder.append(hex.charAt(remider));

			n = share;
		}
		
		System.out.println(stringBuilder.reverse()); // 1376
		
	}

}
