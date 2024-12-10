package tp3;

import java.util.Scanner;

public class Rectangle implements Forme {
	private int x;
	private int y;
	private int longueur;
	private int largeur;

	/**
	 * @return La position x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param La nouvelle position x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return La position y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param La nouvelle position y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return La longueur du rectangle
	 */
	public int getLongueur() {
		return longueur;
	}

	/**
	 * @param La nouvelle longueur du rectangle
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return La largeur du rectangle
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * @param La nouvelle largeur du rectangle
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public void creer() {
		var scanner = new Scanner(System.in);
		System.out.print("Entrez la position x : ");
		this.x = scanner.nextInt();
		System.out.print("Entrez la position y : ");
		this.y = scanner.nextInt();
		System.out.print("Entrez la longueur : ");
		this.longueur = scanner.nextInt();
		System.out.print("Entrez la largeur : ");
		this.largeur = scanner.nextInt();
	}

	@Override
	public void afficher() {
		System.out.println(String.format("Position x,y : %d,%d", x, y));
	}

	@Override
	public void deplacer(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public boolean verifier() {
		return x <= 800 && x >= 0 && y >= 0 && y <= 600;
	}
}
