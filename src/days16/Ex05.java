package days16;

public class Ex05 {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		// p1.
		// 객체명.필드
		// 객체명.메서드()
		/*
		 * 			[ 상속 계층도 ]
		 *				Object
		 *	  ↑			  			↑
		 *	Point			Shape(도형) 클래스
		 *							↑
		 *					Circle(원), Triangle(삼각형)
		 *
		 *	상속관계 == is ~ a 관계
		 *				~은 ~이다.
		 *				원은 도형이다.
		 *				삼각형은 도형이다.
		 *
		 */
		
		/*
		Point center = new Point(50, 50);
		int radius = 10;
		Circle c = new Circle(center, radius);
		*/
		
		/*
		Point[] p = new Point[3];
		p[0] = new Point(1,1);
		p[1] = new Point(20,40);
		p[2] = new Point(10,5);
		
		Triangle t = new Triangle(p);
		*/
		// 클래스 배열 초기화
		Point[] p = {
			new Point(1,1),
			new Point(20,40),
			new Point(10,5),
		};
		
	} // main

} // class

// 자동으로 컴파일러가 Object 클래스를 상속받는다.
// 모든 클래스의 최상위 슈퍼클래스는 Object 클래스이다.
class Point extends Object{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
}

class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
	
} // shape

class Circle extends Shape {
	// 원점
	// int x, y;
	Point center;	// has-a 관계
	
	// 반지름
	int r; // radius
	
	Circle() {
		// this( new Point(0,0), 0);	// Circle(Point center, int r)
		// this(0,0,0);					// Circle(int x, int y, int r)
	}
	Circle(int x, int y, int r){
		this.center = new Point(x, y);
		this.r = r;
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	
} // circle

// 삼각형
// 한 평면상에 일직선상에 없는 3개의 점 a,b,c를 2개씩 쌍으로 하여 
// 선분을 연결하여 이루어진 도형
class Triangle extends Shape {
	
	// 3개의 점
//	int x1, y1;
//	int x2, y2;
//	int x3, y3;
	
//	Point p1;
//	Point p2;
//	Point p3;
	
	// 클래스 배열 선언
	// Point[] p = new Point[3];
	Point[] p = null;
	
	public Triangle(Point[] p) {	// 생성자 DI(의존성 주입)
		this.p = p;
	}
	
}