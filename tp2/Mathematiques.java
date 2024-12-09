package tp2;

public class Mathematiques {
	public static double calculer(double a, double b, char operateur)  {
		switch(operateur) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if(b==0)
				throw new ArithmeticException("La division par zéro est interdite.");
			return a/b;
		default:
			throw new IllegalArgumentException("L'opérateur est invalide.");
		}
	}
}
