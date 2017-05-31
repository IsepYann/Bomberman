package domaine;

import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Horloge extends JFrame{
	
	Timer timer = new Timer();
	
	public Integer TempsDepart;
	public void FinPartie ( ) {  }
	
		//Declaration de variables
		private int heure=0,minute=0,seconde=0;
		private int delais=1000;
	
		private JLabel label=new JLabel(""+heure+":"+minute+":"+seconde);
		private ActionListener tache_timer;
		private Object timer1;
	
	
		public void  Frame(){
			//Ajout de notre Jlabel au composant fenetre
			this.getContentPane().add(label);
			chrono();
		}
	
		//Methode pour lancer notre chrono
		public void chrono(){
			tache_timer= new ActionListener()  {
			  public void actionPerformed(ActionEvent e1)  {
			    seconde++;
			     if(seconde==60)  {
			          seconde=0;
			          minute++;
			      }
			  if(minute==60) {
			      minute=0;
			      heure++;
			   }
			  //Afficher le chrono dans un JLabel
			  label.setText(heure+":"+minute+":"+seconde);
	
			 }
	     };
	     //Action et temps execution de la tache
	     final Timer timer1=new Timer();
	     //Demarrer le chrono
	     timer1.start();
		}


	}
	
