package tp2;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var myStr = scanner.next();
		System.out.println("La chaine en minuscule : " + myStr.toLowerCase());
		System.out.println("La chaine en minuscule : " + myStr.toUpperCase());
	}
}
