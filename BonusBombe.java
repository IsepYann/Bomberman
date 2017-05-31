
import java.util.*;
import java.awt.*;

public class BonusBombe {

    public BonusBombe() {
    }
    
    public Color apparence;

    
    public int rayon;

    //Nécessité des positions X et Y dans cette classe?
    public int positionX;

    public int positionY;

    public Boolean Bomberouge;
    
    //Bonus Flamme Bleue
    public void DiminuePortee() {
    	while(this.rayon>1){
    	this.rayon=this.rayon-1;
    	//Gérer la flamme.Nécessité de la fonction Afficher?
    	}
    	
    }

    //Bonus Flamme Jaune
    public void AugmentePortee() {
    	while(this.rayon<10){
        	this.rayon=this.rayon+1;
        	//Gérer la flamme.Nécessité de la fonction Afficher?
        	}
    }

    public void Afficher() {
        // TODO implement here
    }

    public void BonusBombeRouge() {
        // TODO implement here
    }

}