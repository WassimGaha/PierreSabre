package personnages;

public class Ronin extends Humain{
	private int honeur = 1;
	public Ronin(String nom, String favBoisson, int argent) {
		super(nom, favBoisson, argent);
	}
	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		int don = (int)(argent * 0.1);
		perdreArgent(don);
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoirArgent(don);
	}
	public void provoquer(Yakuza adversaire) {
		int argent = getArgent();
		int force = honeur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa!");
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			honeur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honeur--;
			adversaire.gagner(argent);
			perdreArgent(argent);
		}

	}
}
