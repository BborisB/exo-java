package tp2;

import java.util.*;

public class Etudiant {
	private String prenom;
	private String nom;
	private List<Integer> notes;

	public Etudiant() {
		this.prenom = this.nom = "";
		this.notes = new ArrayList<Integer>();
	}

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
	
	public void ajouterNotes(int... notes) {
		for(int note : notes) {
			this.notes.add(note);
		}
	}

	public double moyenne() {
		if (notes.size() > 0) {
			double moy = 0;
			for (int n : notes)
				moy += n;
			return moy / notes.size();
		} else
			return 0;
	}

	public String initiales() {
		return String.format("%c%c", prenom.charAt(0), nom.charAt(0));
	}

	public String trigramme() {
		return String.format("%c%c%c", prenom.charAt(0), nom.charAt(0), nom.charAt(nom.length() - 1));
	}
}
