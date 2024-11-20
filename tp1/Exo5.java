package tp1;
import java.util.Scanner;

public class Exo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez vôtre âge : ");
		var age = lectureClavier.nextInt();
		System.out.println(age < 18 ? "Vous êtes mineur." : "Vous êtes majeur.");
		lectureClavier.close();
	}
}
