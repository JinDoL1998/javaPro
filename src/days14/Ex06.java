package days14;

public class Ex06 {

	public static void main(String[] args) {
		
		// [객체(클래스) 배열]
		// 클래스(Point)를 자료형으로 선언된 배열을 클래스배열이라고 한다.
		
		Point [] points = new Point[3];
		
		for(int i = 0; i < points.length; i++) {
			points[i] = new Point();	// 꼭 주의
			points[i].dispXY();
		}
		
		/*
		Point p1 = null;
		p1 = new Point();
		p1.dispXY();
		*/
		
	}

}
