package domaine;

import java.awt.Color;
import java.awt.Graphics;


public interface Affichage {
	
	 //calcul les unités de temps qu'il faut pour representer des secondes
    public  static  int unit_secondes(int secs){
    	return secs;
    }
	public static int bombe =(Integer) null;
	
	public static final byte  Bloc = (Byte)null;
	public static int bombe_explosion_temps= Affichage.unit_secondes(5); //duree avant l'explosion 
	
	  public static   float   random_seuil=   0.4f;   //seuil pour le tirrage au sort du terrain
	    
	    public static   int     largeur_bloc= 32;     //largeur d'un bloc
	    public static   int     hauteur_bloc= 32;     //hauteur d'un bloc
	    public  static  float   random_seuil_bonus=     0.5f;       //chance d'avoir un bonus lors de l'explosion d'une brique
	    
	    //les differents blocs
	    public static   byte bloc_vert=    0;
	    public static   byte bloc_gris=    1;
	    public static   byte bloc_orange= 2;
	    public static   byte bloc_flamme_bleue= 3;
	    public static   byte bloc_flamme_rouge= 4;
	    public static   byte bloc_flamme_jaune= 5;
	    public static   byte bloc_bombe_rouge= 6;
	    
	    //nombre de bonus differents
	    public  static  int nb_bonus=4;
	    
	    static  int scale=              2;
	    static  int largeur_decoupe         =18;
	    static  int hauteur_decoupe         =23;
	    static  int largeur=                  (int) (largeur_decoupe*scale);   //largeur du joueur
	    static  int hauteur=                  (int) (hauteur_decoupe*scale);   //hauteur du joueur
	    
	    static  Color   ColorKey=           new Color(255,206,255);
	    static  float   ColorKeyTolerance   =0.1f;
	    
	    static  int bombes_a_poser_defaut   =   1;  //nombre de bombes que peut poser le joueur au depart
	    
	    public default void display(Graphics g, int x, int y){}
	
	    
	    static  int anim_immobile   =5;
	
	    
	    
	    
	    
	    
}




