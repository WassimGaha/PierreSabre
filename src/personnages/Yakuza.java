package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String favBoisson, int argent, String clan) {
		super(nom, favBoisson, argent);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.seFaireExtorquer();
		this.gagnerArgent(somme);
		parler("J'ai piqué les "+somme+" sous de "+ victime.getNom() +", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
}
