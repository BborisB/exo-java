package tp2;

public class Exo7 {

	public static void main(String[] args) {
		var etudiant1 = new Etudiant("Jean", "Dupont");
		etudiant1.ajouterNotes(12,20,12,13,15);
		System.out.println(etudiant1.moyenne());
		System.out.println(etudiant1.initiales());
		System.out.println(etudiant1.trigramme());
	}

}
