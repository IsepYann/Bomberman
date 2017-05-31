
import java.util.*;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;


public class Cases {

    
    public Cases(double X,double Y) {
    	couleur=StdDraw.ORANGE;
    	taille=0.08;
    	this.positionX=X;
    	this.positionY=Y;
    	
    }

    
    public Color couleur;

    public double taille;

    public double positionX;

    public double positionY;

    public int bonus;


    public Color getCouleur() {
        // TODO implement here
        return couleur;
    }

    
    public double getX() {
        // TODO implement here
        return this.positionX;
    }

    
        public double getY() {
        // TODO implement here
        return this.positionY;
    }

        public void setX(double X){
        	this.positionX=X;
        }
        
        public void setY(double Y){
        	this.positionY=Y;
        }
        
        public void AfficherCase(Plateau p){
        	StdDraw.setPenColor(couleur);
        	StdDraw.filledSquare(this.positionX, this.positionY, this.taille/2);
        }
        
}