

import javax.swing.SwingUtilities;

public class Test {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Graphe fenetre = new Graphe();
				fenetre.setVisible(true);
			}
		});
	}
}
