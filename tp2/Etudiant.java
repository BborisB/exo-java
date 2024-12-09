package tp2;

import java.util.*;

public class Etudiant {
	private String prenom;
	private String nom;
	private List<Integer> notes;

	/**
	 * Initialise un étudiant avec des valeurs par défaut.
	 */
	public Etudiant() {
		this.prenom = this.nom = "";
		this.notes = new ArrayList<Integer>();
	}

	/**
	 * Initialise un étudiant avec un nom et un prénom.
	 * @param prenom Le prénom de l'étudiant
	 * @param nom Le nom de l'étudiant
	 */
	public Etudiant(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		this.notes = new ArrayList<Integer>();
	}

	/**
	 * @return Le prénom de l'étudiant
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom Le nouveau prénom de l'étudiant
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return Le nom de l'étudiant
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param Le nouveau nom de l'étudiant
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return Les notes de l'étudiant
	 */
	public List<Integer> getNotes() {
		return notes;
	}

	/**
	 * @param Les notes de l'étudiant
	 */
	public void setNotes(List<Integer> notes) {
		this.notes = notes;
	}
	
	/**
	 * Ajoute des notes à l'étudiant
	 * @param notes Les notes à ajouter
	 */
	public void ajouterNotes(int... notes) {
		for(int note : notes) {
			this.notes.add(note);
		}
	}

	/**
	 * Calcule la moyenne de l'étudiant.
	 * @return La moyenne de l'étudiant
	 */
	public double moyenne() {
		if (notes.size() > 0) {
			double moy = 0;
			for (int n : notes)
				moy += n;
			return moy / notes.size();
		} else
			return 0;
	}

	/**
	 * @return Les initiales de l'étudiant
	 */
	public String initiales() {
		return String.format("%C%C", prenom.charAt(0), nom.charAt(0));
	}

	/**
	 * @return Le trigramme de l'étudiant
	 */
	public String trigramme() {
		return String.format("%C%C%C", prenom.charAt(0), nom.charAt(0), nom.charAt(nom.length() - 1));
	}
}
