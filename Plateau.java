package domaine;

public abstract class Plateau implements Affichage{
	 public  int     largeur,hauteur;    //les dimensions
	 private byte    terrain[][];    //le tableau representant le terrain
	 private Bombe bombe;         //les bombes dans le terrain
	 private BonusBombe bonusb;          //les bonus du terrain
	 private BonusJoueur bonusj;
	 private String  images[];   //les animations
	 private boolean refresh[][];    //tableau de rafraichissement
	 
	public Plateau (boolean a){} 
	public byte tile_at(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
		}

	 /** Creates a new instance of terrain */
	    public Plateau() {
	        largeur=0;
	        hauteur=0;
	        bombe=null;}
	    //construction d'un terrain aux dimensions voulues
	    public  Plateau(int w,int h)
	    {
	        largeur=w;
	        hauteur=h;
	        
	        bombe=null;
	        create_Plateau();}
	    
	    //instancie le tableau des blocs
	    private void create_Plateau() {
	    	 terrain=new byte[largeur][hauteur];

	    	}
	    
	    //rempli le terrain au hasard
	    public  void    build_terrain_randomly()
	    {
	        float   s;
	        for(int y=0;y<hauteur;y++)
	        {
	            for(int x=0;x<largeur;x++)
	            {
	               if   ( (((x) % 2 == 0) && ((y) % 2 == 0)) | (x==0 | y==0 | x==largeur-1 | y==hauteur-1))
	               {
	                   if   (x==0 | y==0 | x==largeur-1 | y==hauteur-1)
	                       terrain[x][y]=Bloc;
	            }
	            }
	        }
	               }
	               
	               //donne la largeur du terrain (en nombre de blocs)
	               public int width()
	               {
	                   return  largeur;
	               }
	               
	               //donne la hauteur du terrain (en nombre de blocs)
	               public int height()
	               {
	                   return  hauteur;
	               }
	               
	             //donne la largeur d'une brique
	               public  int tile_width()
	               {
	                   return  largeur_bloc;
	               }
	               
	               //donne la hauteur d'une brique
	               public  int tile_height()
	               {
	                   return  hauteur_bloc;
	               }
	               
	               //donne le bonus a la position specifiée
	               public  BonusBombe get_bonus_at(int bx,int by)
	               {
	                   
	                   if  (bonusb==null)   return  null;
	                   
	                   BonusBombe   b=bonusb;
	                   while(b!=null)
	                   {
	                      
	                       b=b.next_bonus();
	                   }
	                  
	                   return  b;
	               }
	               
	             //ajoute un bonus
	               //j : joueur qui pose la bombe
	               public  BonusBombe drop_bonus(int bx,int by,byte type)
	               {
	                   if  (bx <0 | by<0 | bx>=largeur | by >=hauteur) return  null;
	                   
	                  
	                   if  (bonusb==null)
	                   {
	                       bonusb=new BonusBombe(this,bx,by,type, bonusb);
	                       return  bonusb;
	                   }
	                   else
	                   {
	                       BonusBombe b=new BonusBombe(this,bx,by,type,bonusb);
	                       bonusb.add_last();
	                       return  b;
	                   }
	               }
	               
	               //ajoute une bombe
	               //j : joueur qui pose la bombe
	               public  Bombe drop_bomb(Joueur1 j,int temps,int bx,int by)
	               {
	                   if  (bx <0 | by<0 | bx>=largeur | by >=hauteur) return  null;
	                   
	                   if  (terrain[bx][by]==Bloc)
	                       return  null;
	                   
	                   if  (bombe==null)
	                   {
	                       bombe=new Bombe();
	                       return  bombe;
	                   }
	                   else
	                   {
	                       Bombe b=new Bombe();
	                       bombe.add_last();
	                       return  b;
	                   }
	               }
	               
	               public void add_last() {}
	               
	             //donne les bombes du terrain (1ere de la liste chainee)
	               public  Bombe get_bombs()
	               {
	                   return  bombe;
	               }
	               
	               //definie la valeur de la brique aux coordonnees specifiees
	               //s'il y a un bonus là où l'on veut ecrire, le bonus est automatiquement effacé
	               public  void set_tile_at(byte t,int x,int y)
	               {
	                   if  (x<0 | y<0 | x>=largeur | y>=hauteur)    return;
	               }
	    
	               //donne tous les bonus
	               public  BonusBombe get_bonus()
	               {
	                   return  bonusb;
	               }
	              
}




