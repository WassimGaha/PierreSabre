package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String favBoisson, int argent) {
		this.nom = nom;
		this.boissonFavorite = favBoisson;
		this.argent = argent;
		nbConnaissance = 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	
	public int getArgent() {
		return argent;
	}
	protected void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	public void boire() {
		parler("Mmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}

	}
	protected void gagnerArgent(int gain) {
		argent += gain;

	}
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance >= 30) {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissance-1] = autreHumain;
		} else {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		}
	}
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder();
		for (int i = 0; i<nbConnaissance; i++) {
			texte.append(memoire[i].getNom());
			if (i < nbConnaissance-1) {
				texte.append(", ");
			}
		}
		parler("Je connais beaucoup de monde dont: "+texte.toString());
	}
}
