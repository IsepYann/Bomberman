package domaine;

import java.awt.Graphics;

public class Bombe implements Affichage {
	
	private int RayonExplosion;
	private boolean Explosee;
	private boolean flambe;   //en train de flamber ou non
	private Plateau terrain; //terrain dans lequel est la bombe
	private int x;
	private int y;
	private int Timer; //date a laquelle la bombe explose
	private Joueur1  joueur;  //joueur qui a posé la bombe
	private Bombe next;
	
	 //animations 
    private Affichage  anim_bombe; //animation de la bombe
    private Affichage anim_flames;
	
	public void Poser ( ) {  }
	public void Exploser ( ) {  } 
	public void Destruction ( ) {  }
	public void getTimer ( ) {  }
	public void add_last() {}
	
	//Constructeur par defaut
	public Bombe (){
		x=-1;
		y=-1;
		terrain=null;
	    Timer=0;
	    Explosee=false;
	    next=null;
	    terrain.set_tile_at(bloc_bombe_rouge,x,y);
	    RayonExplosion=3;
	}
	
//donne la position x dans le terrain de la bombe
public  int get_pos_x()
{
   return   x;
}

//donne la position y dans le terrain de la bombe
public  int get_pos_y()
{
   return   y;
}

//explose la bombe
public void explode()
{
    if  (Explosee)  return;
    
    terrain.set_tile_at(Bloc,x,y);
    
    if  (joueur!=null)
        joueur.undrop_bomb();
    
    Explosee=true;
    flambe=true;

}

//affiche la bombe
public void display(Graphics g)
{
    if  (!Explosee)
    {
        /*if  (temps_c % 2 == 0)
            g.setColor(Color.BLACK);
        else
            g.setColor(Color.WHITE);
        
        g.fillRect(sx,sy, te.tile_width(),te.tile_height());
         */
        
        anim_bombe.display(g,x,y);
        
    }else
    {
        if  (flambe)
        {
           anim_flames.display(g,x,y);
        }
    }
}

//affiche toutes les bombes
public static void display_bombs(Bombe bombes,Graphics g)
{
    Bombe b=bombes;
    while(b!=null)
    {
        b.display(g);
        b=b.next;
    }
}

//choisit un bonus au hasard
public  byte choice_bonus()
{
    if  (Math.random()>=random_seuil_bonus)
        return  (byte) (((int) (Math.random()*100.0f)%nb_bonus)+bloc_bombe_rouge);
    	return (byte)(((int) (Math.random()*100.0f)%nb_bonus)+bloc_flamme_bleue);
    	   	
   
}

//depose un bonus
private void drop_bonus(byte bonus,int x,int y)
{        
    //tire au hasard un bonus
    
    if  (terrain!=null)
        terrain.drop_bonus(x,y,bonus);
}
	
	
}
