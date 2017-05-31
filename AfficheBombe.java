package domaine;

import edu.princeton.cs.introcs.StdDraw;

public class AfficheBombe {
	
	int[][] pose= new int[5][5];
	boolean m;
	 
	void setup() {
	size(400,400);
	}
	 
	void draw() {
	  background(0);
	//  pose[0][0] =1;
	bombes();
	mouse();
	explosion();
	}
	 
	void bombes() {
	 
	  for(int i=0; i<5;i++) {
	    if(pose[i][0]==1) {
	      ellipse(pose[i][1],pose[i][2],20,20);
	    }
	  }  
	}
	 
	void mouse() {
	  if(clic()==true) {
	    int i=0;
	   while(pose[i][0]==1) {
	     i++;
	   }
	 
	   pose[i][0]=1;
	   pose[i][1]=mouseX;
	   pose[i][2]=mouseY;
	   pose[i][3]=millis() +5000;
	}
	}
	 
	boolean clic(){//return true if clic (front montant)
	    if(mousePressed==false){ m=true; }
	    if(m==true && mousePressed==true){
	      m=false;
	      return true;
	    }
	    else{return false;}
	}
	 
	void explosion() {
	  for(int i=0; i<5;i++) {
	    println("temps",(millis()),"bombe",pose[i][3]);
	    if(pose[i][3]<(millis()) && pose[i][0]!=0) {
	      println("boum");
	      for(int j=0;j<4;j++) {
	        pose[i][j]=0;
	    }
	    }
	  }
	
	StdDraw.setCanvasSize(700,550);
	StdDraw.setXscale(-WIDTH, X_MAX+WIDTH); 
	StdDraw.setYscale(-WIDTH, Y_MAX+WIDTH);
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
