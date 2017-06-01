
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

//Méthode déplacement
    public boolean keyDown (Event evt, int key){
    	switch(key){
    	//Flèche du bas
    	case Event.Down:
    		if(positionY>0){
    			positionY=positionY--;
    		}
    			break;
    			
    			//Flèche du haut
    			case 1004:
    				if(positionY<550){ //550=largeur max du terrain
    					positionY++;
    				}
    					break;
    				
    				
    			//Flèche vers la gauche
    			case Event.LEFT{
    				if(positionX>0){
    					positionX--;
    					}
    				break;
    			
    				//Flèche vers la Droite
    				case Event.RIGHT:
    					if(positionX<750){  //750=longueur max du terrain
    						positionX++;
    					}
    				break;
    				return true;
    				}
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