package domaine;

public class BonusBombe {
	
	private int Apparence;
	private Plateau terrain;
	private int     x;     //position x dans le terrain
	private int     y;     //position y dans le terrain
	private BonusBombe   next;   //bonus suivant dans la liste chainee
	public  byte    type;   //type de bonus
	private int Rayon;
	public void add_last ( ) {  }
	public void IgnoreObjetDestructibleExplosion ( ) {  }
	
	//constructeur
	public BonusBombe (Plateau t, int R, int x, int y, byte type){
		this.Rayon=R;
		x=x;
		y=y;
		next=null;
		terrain=t;
		this.type=type;
		 if  (terrain!=null)
	            terrain.set_tile_at(type,x,y);
	    }
		
	public BonusBombe(Plateau t,int x,int y,byte type,BonusBombe first) 
    {
        x=x; y=y;
        add_last();
        terrain=t;
        this.type=type;
        
        if  (terrain!=null)
        {
       {
            	 terrain.set_tile_at(type,x,y);
            }
        }
        }
               
     //donne la position x du bonus
       public int get_position_x()
       {
           return  x;
       }
       
       //donne la position y du bonus
       public int get_position_y(){
       {
           return  y;}
       }
       
       //donne le bonus suivant dans la liste chainee
       public  BonusBombe   next_bonus(){
       {
           return  next;}
       }
		
     //renvoi le type de bonus
       public  byte    get_type(){
       {
           return  type;}
       }
       
       //effet du bonus sur le joueur lorsqu'il le ramasse
       public  void    effect_bonus(Joueur1 j)
       {
           terrain.set_tile_at(terrain.bloc_vert,x,y);
           effect_bonus(j,type);
       }
      
       //effet des bonus 
       static public  void effect_bonus(Joueur1 j,byte typ)
       {
           {
               
                 Affichage_bloc_flamme_rouge:    //bonus flamme rouge
                   j.give_bombs(10);
           }
               
                   Affichage_bloc_flamme_bleue: //bonus Flamme Bleue
               {
                   int diminue=((int) (Math.random()*1000.0f))%3;
                 
                   if  (diminue==1)  //retrecie les flammes
                   {
                      j.give_bombs(-1); 
                   }
                   if  (diminue==2)  //enleve une bombe
                   {
                      j.give_bombs(-1); 
                   }
                   System.out.print("diminue="+diminue);
               }
               
           Affichage_bonus_flamme_jaune: //FlammeJaune
           {
               int augmente=((int) (Math.random()*1000.0f))*3;
             
               if  (augmente==1)  //retrecie les flammes
               {
                  j.give_bombs(+1); 
               }
               if  (augmente==2)  //enleve une bombe
               {
                  j.give_bombs(+1); 
               }
               System.out.print("augmente="+augmente);
           }
             
           }
       
		}
	

