import java.awt.Color;
import java.util.ArrayList;

import edu.princeton.cs.introcs.StdDraw;
public class AfficheJeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cases case1= new Cases(0,0);	
	Plateau plateau= new Plateau(true);
		//StdDraw.setCanvasSize(1000,1000);
		while(true){
			for(int i=0;i<=20;i++){
				for(int j=0;j<16;j++){
					case1.AfficherCase(plateau);
					double a= case1.getX();
					double b=case1.getY();
					case1.setX(a);
					case1.setY(b);
				}
			}
			StdDraw.show(1);
			//StdDraw.clear(Color.CYAN);
		}
	}

}
