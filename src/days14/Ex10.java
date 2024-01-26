package days14;

public class Ex10 {

	
	public static void main(String[] args) {
		
		Ex10 obj = new Ex10();
		
		// 메서드 (기본형 매개변수, 참조형 매개변수 )
		// [리턴자료형이 참조형인 경우]
		int[] m = new int[3];
		
		m = obj.increaseArray(m);
		
		System.out.println(m.length);
		
	}

	private int[] increaseArray(int[] m) {
		int[] temp = new int[m.length + 3];
		
		return temp;
	}

}
