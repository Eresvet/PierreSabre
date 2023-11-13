package personnages;

public class Samourai extends Ronin {

	private String seigneur;
	
	public Samourai(String seigneur, String nom, String favBoisson, int argentPossede) {
		this.seigneur = seigneur;
		super(nom, favBoisson, argentPossede);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
}
