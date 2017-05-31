
import java.util.*;
import java.awt.*;

public class Joueur {

    public Joueur(String nom,Color couleur) {
    	this.nom=nom;
    	nbvies=3;
    	nbbombesmax=0;
    	vitesse=0;
    	positionX=0;
    	positionY=0;
    }

    public String nom;

    public Color couleur;

    public int nbvies;

    public int nbbombes;

    public double vitesse; //Type changé en double

    public int nbbombesmax;

    public int positionX;

    public int positionY;


    public void Deplacement() {
        if(this.positionX==0 && this.positionY==0){
        	 // Gérer les évènements clavier
        	// Une classe doit-elle être créée?
        }
    }

    public void PoserBombes() {
        // TODO implement here
    	
        // Gérer les évènements clavier
    }

    public String getNom() {
        
        return this.nom;
    }

    public Color getCouleur() {
        return this.couleur;
    }

    public int getVie() {
       
        return this.nbvies;
    }
    
    public double getVitesse() {
        
        return this.vitesse;
    }
    
    public int getBombes() {
        // TODO implement here
        return nbbombes;
    }

    /* Cette méthode ,'a pas de sens ici car BonusVieJoueur n'est pas défini dans notre classe
     
    public int getBonusVieJoueur() {
        
        return null;
    }
*/
    public void Mort() {
        if (nbvies==0){
        	
        }
    }

    public void OrientationJoueur() {
        // TODO implement here
    }


}