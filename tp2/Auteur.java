package tp2;

public class Auteur {
	private String prenom;
	private String nom;

	public Auteur(String prenom, String nom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
