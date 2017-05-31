
import java.util.*;
import java.awt.*;

public class BonusJoueur {

	public BonusJoueur(Joueur joueur1) {
    }

    public Color apparence;

    
    public int positionX;

    public int positionY;


    public void SpeedUp() {
    	joueur1.getVitesse=joueur1.getVitesse++;
    	//Nécessité de mettre la vitesse en attribut!!?
    	//Décider du nombre d'incrémentation de la vitesse pour ce bonus
    	
    }

    
    public void SpeedDown() {
    	joueur1.getVitesse=joueur1.getVitesse--;
    	//Nécessité de mettre la vitesse en attribut!!?
    	//Décider du nombre de décrémentation de la vitesse pour ce bonus
    }

    public void BonusVie() {        //Méthode getVie(nom pas adapté) changé en BonusVie
    	joueur1.getVie=joueur1.getVie++;
    	//Nécessité de mettre le nb de vies en attribut!!?
    	
    }

    public void BombePlus() {		//Méthode getBombePlus(nom pas adapté) changé en BonusPlus
        while(joueur1.getBombesMax<7){
    	joueur1.getBombesMax=joueur1.getBombesMax+2;
        }
    }

    public void BombeMoins() {	//Méthode getBombePlus(nom pas adapté) changé en BonusPlus
    	while(joueur1.getBombesMax<2){
        	joueur1.getBombesMax=joueur1.getBombesMax-2;
            }
    }

    
    public void Afficher() {
        // Nécessité? Dans la mesure où elle les instructions puvent directement être mises dans
    	//Les fonctions concernées.
    	
    }

}