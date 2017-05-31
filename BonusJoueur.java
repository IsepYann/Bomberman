package domaine;
import java.awt.Color;

public class BonusJoueur {
	
	private Color Apparence;
	public void SpeedUp ( ) {
		Joueur1.getVitesse=Joueur1.getVitesse++;
	}
	public void SpeedDown ( ) {
		Joueur1.getVitesse=Joueur1.getVitesse--;
	}
	public void getVie ( ) {
		Joueur1.getVie=Joueur1.getVie++;
	}
	public void getBombePlus ( ) { 
		Joueur1.getBombesMax=Joueur1.getBombesMax+2;
	}
	public void getBombeMoins ( ) {
		Joueur1.getBombesMax=Joueur1.getBombesMax-2;
	}
	public void Afficher ( ) {  }
	
	
	
	
	
	
	
	
	
	
	

}
