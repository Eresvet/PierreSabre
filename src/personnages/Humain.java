package personnages;

public class Humain {
	private String nom;
	private String favBoisson;
	private int argentPossede;
	
	public Humain(String nom, String favBoisson, int argentPossede) {
		this.nom = nom;
		this.favBoisson = favBoisson;
		this.argentPossede = argentPossede;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgentPossede() {
		return argentPossede;
	}
	
	public void gagnerArgent(int gain) {
		argentPossede += gain;
	}
	
	public void perdreArgent(int perte) {
		argentPossede -= perte;
	}
	
	private void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + favBoisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + favBoisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix > argentPossede) {
			parler("Je n'ai plus que " + argentPossede + " sous en poche. Je ne peux meme pas m'offrir "
					+ bien + " à " + prix + " sous.");
		}else {
			parler("J'ai " + argentPossede + " sous en poche. Je vais pouvoir m'offrir " 
					+ bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
}
