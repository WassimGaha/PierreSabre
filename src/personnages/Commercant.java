package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		int somme = argent;
		argent = 0;
		return somme;
	}
	public void recevoirArgent(int argent) {
		parler(argent+" sous ! Je te remercie généreux donateur!");
		this.gagnerArgent(argent);
	}
}
