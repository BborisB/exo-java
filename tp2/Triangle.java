package tp2;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	private int test;

	public Triangle() {
		this.p1 = new Point();
		this.p2 = new Point();
		this.p3 = new Point();
	}

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public double perimetre() {
		return Point.distance(p1, p2) + Point.distance(p2, p3) + Point.distance(p3, p1);
	}

	public double aire() {
		var a = Point.distance(p1, p2);
		var b = Point.distance(p2, p3);
		var c = Point.distance(p3, p1);
		return 0.25 * Math.sqrt(a + b + c) + Math.sqrt(-a + b + c) + Math.sqrt(a - b + c) + Math.sqrt(a + b - c);
	}

	public void deplacer(double x, double y) {
		p1.deplacerX(x);
		p2.deplacerX(x);
		p3.deplacerX(x);
		p1.deplacerY(y);
		p2.deplacerY(y);
		p3.deplacerY(y);
	}

	public void reduire(double x, double y) {
		var xavg = (p1.getX() + p2.getX() + p3.getX()) / 3;
		var yavg = (p1.getY() + p2.getY() + p3.getY()) / 3;
		if (p1.getX() < xavg)
			p1.deplacerX(-x);
		else
			p1.deplacerX(x);
		if (p2.getX() < xavg)
			p2.deplacerX(-x);
		else
			p2.deplacerX(x);
		if (p3.getX() < xavg)
			p3.deplacerX(-x);
		else
			p3.deplacerX(x);
		if (p1.getY() < yavg)
			p1.deplacerY(-y);
		else
			p1.deplacerY(y);
		if (p2.getY() < yavg)
			p2.deplacerY(-y);
		else
			p2.deplacerY(y);
		if (p3.getY() < yavg)
			p3.deplacerY(-y);
		else
			p3.deplacerY(y);
	}
}
