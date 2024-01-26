package days10;

import javax.xml.transform.stream.StreamResult;

public class Ex01_01 {

	public static void main(String[] args) {		
		
		// 10진수 정수 => 16진수 출력
		
		String strHex = "";
		int n = 125;
		
		int remider, share;
		while(n!=0) {
			share = n / 16;
			remider = n % 16;
			switch (remider) {
			case 10: remider = 'A'; break;
			case 11: remider = 'B'; break;
			case 12: remider = 'C'; break;
			case 13: remider = 'D'; break;
			case 14: remider = 'E'; break;
			case 15: remider = 'F'; break;
			
			default: remider = remider + '0'; break;
			}
			strHex += (char)remider;
			n = share;
		}
		
		System.out.println(strHex); // 1376
		
	}

}
