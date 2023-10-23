package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argentPossede) {
		super(nom, "thé", argentPossede);
	}
	
	public int seFaireExtorquer(){
		int argentExtorque = getArgentPossede();
		setArgentPossede(0);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentExtorque;
	}
	
	public void recevoirArgent(int argent) {
		setArgentPossede(getArgentPossede() + argent);
		parler(getArgentPossede() + " sous ! Je te remercie genereux donateur!");
	}
	
}
