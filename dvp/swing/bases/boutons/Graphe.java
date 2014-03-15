package dvp.swing.bases.boutons;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphe extends JFrame{
	public Graphe(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
	private void build(){
		setTitle("Calculatrice"); //On donne un titre à l'application
		setSize(400,200); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);

		JButton bouton = new JButton(new CalculAction(this, "Calculer"));
		
		panel.add(bouton);
		
		JLabel label = new JLabel("Résultat : Pas encore calculé");
		
		panel.add(label);
		
		return panel;
	}
}