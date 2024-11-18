package tp2;

public class Exo4 {

	public static void main(String[] args) {
		Livre livre = new Livre(
			"La méthode Merise. Principes et outils",
			new Auteur("Hubert", "Tardieu"),
			new Categorie("J'ai pas d'inspiration désolé"),
			"978-2-07-061275-8"
		);
		var bibliotheque = new Bibliotheque();
		bibliotheque.getLivres().add(livre);
		bibliotheque.showLivresCode();
	}
}
