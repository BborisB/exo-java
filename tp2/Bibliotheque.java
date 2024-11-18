package tp2;

import java.util.*;

public class Bibliotheque {
	private List<Livre> livres;
	
	public Bibliotheque() {
		setLivres(new ArrayList<Livre>());
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
	public void showLivresCode() {
		for(Livre livre: livres) {
			System.out.println(livre.code());
		}
	}
}
