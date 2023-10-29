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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(force >= adversaire.reputation) {
			gagnerArgent(adversaire.argentPossede);
			honneur++;
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}else {
			if(honneur > 0) {
				honneur--;
			}
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argentPossede);
			perdreArgent(argentPossede);
		}
	}

}
