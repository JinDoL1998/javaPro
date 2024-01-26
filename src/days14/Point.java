package days14;

public class Point {

	// field
	public int x;
	public int y;

	// method
	public void dispXY() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}

	// p1.movePoint()
	public void movePoint(int distance) {
		x += distance;
		y += distance;
	}

	public Point moveNewPoint(int distance) {
		int newx = x + distance;
		int newy = y + distance;

		Point p = new Point();
		p.x = newx;
		p.y = newy;

		return p;
	}

	// p1.plusPoint(p2);
	public void plusPoint(Point p2) {
		x += p2.x;
		y += p2.y;

	}


}
