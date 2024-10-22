package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "kombucha", 54);
		humain.direBonjour();
		humain.acheter("une boisson", 12);
		humain.boire();
		humain.acheter("un jeu", 2);
		humain.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		Ronin roro = new Ronin("roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}
}
