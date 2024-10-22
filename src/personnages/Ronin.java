package personnages;

public class Ronin extends Humain{
	private int honeur = 1;
	public Ronin(String nom, String favBoisson, int argent) {
		super(nom, favBoisson, argent);
	}
	public void donner(Commercant beneficiaire) {
		int don = (int)(argent * 0.1);
		argent -= don;
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoirArgent(don);
	}
}
