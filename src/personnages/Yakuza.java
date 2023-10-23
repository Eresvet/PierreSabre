package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
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
		argentPossede = 0;
		reputation--;	//FINIR
	}
	
}
