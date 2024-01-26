package days09;

public class Ex03 {

	public static void main(String[] args) {
		
		// money입력받아 할당되는 코딩 선언
		
		int money = 158760;
		int unit = 50000;
		boolean sw = false;	// 스위칭 변수
		int count = 0;	// 화폐갯수
		
		while(unit >= 1) {
			count = money / unit;
			System.out.printf("%d원 : %d개\n", unit, count);
			money %= unit;
			unit /= (sw ? 2 : 5);
			sw = !sw;
			
		}
		
		
		
	}

}
