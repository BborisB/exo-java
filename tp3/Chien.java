package tp3;

public class Chien extends Animal {
	@Override
	public String cri() {
		return "J'abboie.";
	}

	@Override
	public String toString() {
		return "Je suis un chien";
	}
	
	public String abboyer() {
		return "J'abboie super fort attention.";
	}
}
