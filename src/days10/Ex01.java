package days10;

import javax.xml.transform.stream.StreamResult;

public class Ex01 {

	public static void main(String[] args) {
		
		// 10진수 정수 => 8진수 출력
		
		String strResult = "";
		int n = 10;
		int remider, share;
		while(n!=0) {
			share = n/8;
			remider = n % 8;
			strResult += remider;
			n = share;
		}
		
		
		
		
		System.out.println(strResult); // 1376
		
		String reverseStrResult = "";
		for (int i = 0; i < strResult.length(); i++) {
			reverseStrResult += strResult.charAt(strResult.length()-1-i);
		}
		
		System.out.println(reverseStrResult);
		
	}

}
