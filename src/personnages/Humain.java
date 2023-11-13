package personnages;

public class Humain {
	private String nom;
	private String favBoisson;
	protected int argentPossede;
	private int nbConnaissance = 0;
	private final int nbConnaissanceMax = 30;
	private Humain[] memoire = new Humain[nbConnaissanceMax];

	
	public Humain(String nom, String favBoisson, int argentPossede) {
		this.nom = nom;
		this.favBoisson = favBoisson;
		this.argentPossede = argentPossede;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgentPossede() { //pas n�cessaire car argentPossede prot�g�
		return argentPossede;
	}
	
	public void setArgentPossede(int argentPossede) { //pas n�cessaire car argentPossede prot�g�
		this.argentPossede = argentPossede;
	}

	public void gagnerArgent(int gain) {
		argentPossede += gain;
	}
	
	public void perdreArgent(int perte) {
		argentPossede -= perte;
	}
	
	protected void parler(String texte) {
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
					+ bien + " � " + prix + " sous.");
		}else {
			parler("J'ai " + argentPossede + " sous en poche. Je vais pouvoir m'offrir " 
					+ bien + " � " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	public void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}
	
	public void memoriser(Humain autreHumain) {
		if(nbConnaissance >= nbConnaissanceMax) {
			for(int i = 0; i <= nbConnaissanceMax - 2; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissanceMax-1] = autreHumain;
		}else {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		autreHumain.memoriser(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance(){
		
		if(nbConnaissance > 0){
			String connaissances = memoire[0].getNom();
			for(int i = 1; i <= nbConnaissance-1; i++) {
				connaissances = connaissances + ", " + memoire[i].getNom();
			}
			parler("Je connais beaucoup de monde dont : " + connaissances);
		}else {
			parler("je ne connais personne");
		}
	}
	
}
