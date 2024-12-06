package tp1;

import java.util.*;

public class Exo8 {

	public static void main(String[] args) {
		var days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		var months = new String[] {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
		var scanner = new Scanner(System.in);
		System.out.print("Entrez un mois : ");
		int month = scanner.nextInt();
		System.out.println(month<1||month>12 ? "Mois incorrect." : "Nombre de jour dans le mois " + month + " : " +days[(month-1)%12]);
	}
}
