package tp2;

public class Exo5 {

	public static void main(String[] args) {
		var triangle = new Triangle();
		triangle.getP1().setX(10);
		triangle.getP1().setY(10);
		triangle.getP2().setX(1);
		triangle.getP2().setY(1);
		triangle.getP3().setX(4);
		triangle.getP3().setY(4);
		var perimetre = triangle.perimetre();
		System.out.println(perimetre);
	}

}
