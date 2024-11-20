package tp1;
import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		var nombre = lectureClavier.nextInt();
		System.out.println(nombre % 2 == 0 ? "Le nombre est pair." : "Le nombre est impair.");
		lectureClavier.close();
	}
}
