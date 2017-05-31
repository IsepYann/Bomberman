package domaine;

import java.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

import java.awt.image.*;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class Joueur1 {
	
	private String Nom;
	private Plateau terrain;
	private Color couleur;
	private int x;
	private int y;
	private int NbVies;
	private int NbBombes;
	private int BombesPosees;
	private float Vitesse;
	private int NbBombesMax;
	public String Touches;
	public String Fleches;
	public int Timer;
	private Affichage anim;
	private int movement=0;
	
	public void Deplacement (int x, int y ) {  }
	public void PoserBombes ( ) {  }
	public Color getCouleur;
	public static int getVie;
	public static int getBombesMax;
	public static int getBonusVieJoueur;
	public void Mort (){
		NbVies=0;
	}
	public void OrientationJoueur ( ) {
		Touches="q,s,d,z";
		Fleches=null;
	}
	public static int getVitesse;
	
	private void update_current_pos() {}
	private void refresh() {}
	private boolean can_move_down(int i) {
		// TODO Auto-generated method stub
		return false;
		}
	private boolean can_move_up(int i){
		return false;
	}
	private boolean can_move_right(int i){
		return false;
	}
	private boolean can_move_left(int i){
		return false;
	}
	
	public static void nouvellePartie() {}
	
	//Contructeurs
	
	public Joueur1(String N, String string, Color couleur, int x, int y ){
		this.Nom=N;
		this.x=x;
		this.y=y;
		BombesPosees=0;
		NbVies=3;
        Vitesse=0;
        terrain=terrain;
       
	}
	public void Joueur(String T){
		this.Touches=T;
	}
	public Joueur1(String F){
		this.Fleches=F;
	}
	public Joueur1(String T, int E, int NM){
		this.Touches=T;
		this.Timer=E;
		this.NbBombesMax=NM;
	}
	
	
	//getters
	public int getX ( ) { return this.x; } 
	public int getY ( ) { return this.y; }
	public Color getCouleur ( ){ return this.couleur;}

	//setters 
	public void setX (int x){
		this.x=x;
	}
	public void setY (int y){
		this.y=y;
	}
	
	//defini la position du joueur dans le terrain
    public  void set_terrain_pos()
    {
        int x=0;
        int y=0;
    	int width;
        double tile_height;
        x=x*terrain.tile_width();
        y=y*terrain.tile_height();
    }
	
    //affiche le joueur
    public  void display(Graphics g)
    {
        int largeur=0;
        int hauteur=0;
    	if  (anim==null)
        {
            g.setColor(Color.RED);
            g.fillRect(x,y,largeur,hauteur);
        }else
        {
            anim.display(g,x,y);
        }
    }
   
    //pose une bombe
    public  void drop_bomb(int temps)
    {
        if  (BombesPosees>=NbBombes)  return;
       
       // int x=(int) ((sx+largeur/2)/te.tile_width());
       // int y=(int) ((sy+hauteur/2)/te.tile_height());
        update_current_pos();
        
        if  (terrain.tile_at(x,y)==terrain.Bloc)
        {
            terrain.drop_bomb(this,temps,x,y);
            BombesPosees++;
        }
    }
        
        //redonne une bombe au joueur (perdue lorsqu'il en pose une)
        //doit etre executee lorsqu'une bombe appartenant au joueur explose
        public void undrop_bomb(){
        {
            if  (BombesPosees>0)
                BombesPosees--;   
        }
           
    }
    
    //donne n bombes au joueurs 
    public  void give_bombs(int  n)
    {
        if  ((NbBombes+n)>=1){
        	 NbBombes+=n;
        }
    }
    
    //bouge vers la droite le joueur
    private void move_right()
    {   
        refresh();
        
        if  (can_move_right((int) Vitesse))
            x+=Vitesse;
        else
        {
             if  (can_move_right((int) (Vitesse/2.0f)))
                x+=Vitesse/2;
             else
             {
            	int anim_immobile=0;
             	Affichage[] anims=null;
                anim=anims[anim_immobile];
                movement=0;
             }
        }
        }
        
        //bouge vers la gauche le joueur
        private void move_left()
        {
            refresh();
            
            if  (can_move_left((int) Vitesse))
                x-=Vitesse;
            else
            {
                if  (can_move_left((int) (Vitesse/2.0f)))
                    x-=Vitesse/2;
                else
                {
                	int anim_immobile=0;
                	Affichage[] anims=null;
                    anim=anims[anim_immobile];
                    movement=0;
                }
            }
        }
        
        //bouge vers le haut le joueur
        private void move_up()
        {  
            refresh();
            
            if  (can_move_up((int) Vitesse))
                y-=Vitesse;
            else
            {
                if  (can_move_up((int) (Vitesse/2.0f)))
                    y-=Vitesse/2;
                else
                {
                	int anim_immobile=0;
                	Affichage[] anims=null;
                    anim=anims[anim_immobile];
                    movement=0;
                }
            }
        }
        
         //bouge vers le bas le joueur
        private void move_down()
        {   
            refresh();
            
            if  (can_move_down((int) Vitesse))
                y+=Vitesse;
            else
            {
                if  (can_move_down((int) (Vitesse/2.0f)))
                    y+=Vitesse/2;
                else
                {
                	int anim_immobile=0;
                	Affichage[] anims=null;
                    anim=anims[anim_immobile];
                    movement=0;
                }
            }
        }
    
}
