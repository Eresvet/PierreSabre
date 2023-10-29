package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	protected int reputation = 0;
	
	public Yakuza(String nom, String favBoisson, int argentPossede, String clan) {
		super(nom, favBoisson, argentPossede);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		argentPossede += victime.getArgentPossede();
		reputation++;
		int argentVole = victime.getArgentPossede();
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J'ai pique les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + argentPossede
				+ " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre(){
		int argentPerdu = argentPossede;
		perdreArgent(argentPossede);
		if(reputation > 0) {
			reputation--;
		}
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return argentPerdu;
	}
	
	public int gagner(int gain){
		int argentGagne = gain;
		gagnerArgent(argentGagne);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan
				+ " ? Je l'ai dépouillé de ses " + argentGagne + " sous.");
		return argentGagne;
	}
	
}
