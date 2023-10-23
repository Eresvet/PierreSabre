package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	private int force = 2* honneur;

	public Ronin(String nom, String favBoisson, int argentPossede) {
		super(nom, favBoisson, argentPossede);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonner = argentPossede / 10;
		argentPossede -= argentADonner;
		parler(beneficiaire.getNom() + " prend ces " + argentADonner + " sous.");
		beneficiaire.recevoirArgent(argentADonner);
	}
	

}
