package tp2;

public class Livre {
	private Auteur auteur;
	private String titre;
	private Categorie categorie;
	private String isbdn_13;

	public Livre(String titre, Auteur auteur, Categorie categorie, String isbdn_13) {
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.isbdn_13 = isbdn_13;
	}

	public String code() {
		return "" + this.auteur.getPrenom().charAt(0) + this.auteur.getNom().charAt(0) + categorie.getTitre().charAt(0)
				+ (this.isbdn_13.length() > 2 ? this.isbdn_13.substring(this.isbdn_13.length() - 2) : this.isbdn_13);
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCategorie() {
		return titre;
	}

	public void setCategorie(String titre) {
		this.titre = titre;
	}

	public void showInfos() {
		System.out.println("Titre du livre : " + this.titre + "\nAuteur : " + this.auteur);
	}

	public String getIsbdn_13() {
		return isbdn_13;
	}

	public void setIsbdn_13(String isbdn_13) {
		this.isbdn_13 = isbdn_13;
	}
}