
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
    	//N�cessit� de mettre la vitesse en attribut!!?
    	//D�cider du nombre d'incr�mentation de la vitesse pour ce bonus
    	
    }

    
    public void SpeedDown() {
    	joueur1.getVitesse=joueur1.getVitesse--;
    	//N�cessit� de mettre la vitesse en attribut!!?
    	//D�cider du nombre de d�cr�mentation de la vitesse pour ce bonus
    }

    public void BonusVie() {        //M�thode getVie(nom pas adapt�) chang� en BonusVie
    	joueur1.getVie=joueur1.getVie++;
    	//N�cessit� de mettre le nb de vies en attribut!!?
    	
    }

    public void BombePlus() {		//M�thode getBombePlus(nom pas adapt�) chang� en BonusPlus
        while(joueur1.getBombesMax<7){
    	joueur1.getBombesMax=joueur1.getBombesMax+2;
        }
    }

    public void BombeMoins() {	//M�thode getBombePlus(nom pas adapt�) chang� en BonusPlus
    	while(joueur1.getBombesMax<2){
        	joueur1.getBombesMax=joueur1.getBombesMax-2;
            }
    }

    
    public void Afficher() {
        // N�cessit�? Dans la mesure o� elle les instructions puvent directement �tre mises dans
    	//Les fonctions concern�es.
    	
    }

}