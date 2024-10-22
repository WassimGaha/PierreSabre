package personnages;

public class Humain {
	private String nom;
	private String favBoisson;
	private int argent;
	public String getNom() {
		return nom;
	}
	public String getFavBoisson() {
		return favBoisson;
	}
	public int getArgent() {
		return argent;
	}
	public Humain(String nom, String favBoisson, int argent) {
		this.nom = nom;
		this.favBoisson = favBoisson;
		this.argent = argent;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + favBoisson);
	}
	public void boire() {
		parler("Mmm, un bon verre de " + favBoisson + " ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			argent -= prix;
		} else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}

	}
	private void gagnerArgent(int gain) {
		argent += gain;

	}
	private void perdreArgent(int perte) {
		argent -= perte;
	}
	public void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
}
