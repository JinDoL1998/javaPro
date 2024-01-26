package days10;

import javax.xml.transform.stream.StreamResult;

public class Ex01_02 {

	public static void main(String[] args) {		
		
		// 10진수 정수 => 16진수 출력
		
		String strHex = "";
		int n = 125;
		
		int remider, share;
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		while(n!=0) {
			share = n / 16;
			remider = n % 16;

			strHex = ch[remider] + strHex;
			n = share;
		}
		
		System.out.println(strHex); // 1376
		
	}

}
