package domaine;

import edu.princeton.cs.introcs.StdDraw;

public class Terrain {
	
	static int longueur =21 ;
	static int hauteur = 17;
	static int terrain [][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					           {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
					           {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
									};

	
	public static void affichageTerrain(){
		StdDraw.setCanvasSize(700,550);
		StdDraw.setXscale(0,700);
		StdDraw.setYscale(0,550);
    	for(int i=0;i<longueur;i++){
			for(int j=0;j<hauteur;j++){
	        	if (terrain[j][i] == 0){
	        		StdDraw.setPenColor(StdDraw.GRAY);
	        		StdDraw.filledSquare(32*(i+0.5), 32*(j+0.5),16);
	        	}
	        	if (terrain[j][i] == 1){
	        		StdDraw.setPenColor(StdDraw.ORANGE);
	        		StdDraw.filledSquare(32*(i+0.5), 32*(j+0.5),16);
	        	}
			}
    	}
	
	
	
	
	}

}
