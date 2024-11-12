package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String favBoisson, int argent, String clan) {
		super(nom, favBoisson, argent);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		int argent = getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.seFaireExtorquer();
		this.gagnerArgent(somme);
		parler("J'ai piqué les "+somme+" sous de "+ victime.getNom() +", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	public int perdre() {
		int argent = getArgent();
		int argentPerdu = argent;
		this.perdreArgent(argent);
		reputation--;
		parler("J'ai perdu mon duel et mes "+ argentPerdu +" sous, siff... J'ai déshonoré le clan de "+ clan);
		return argentPerdu;
	}
	public void gagner(int gain) {
		String nom = getNom();
		this.gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre "+nom+" du clan "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	public int getReputation() {
		return reputation;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan);
	}
}
