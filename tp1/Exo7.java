package tp1;
import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		var nombre = lectureClavier.nextInt();
		System.out.println(Exo7.isBissextile(nombre) ? "Année bissextile." : "Année non bissextile.");
		lectureClavier.close();
	}
	
	public static boolean isBissextile(int annee) {
		return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) ? true : false;
	}
}
