package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		
		//Histoire 1
		
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
		//Histoire 2
		
		Commercant marco = new Commercant("Marco", 20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
//		marco.perdreArgent(5);
		
		//Histoire 3
		
//		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		//Histoire 4
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		roro.direBonjour();
		roro.donner(marco);
	}
}
