import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VueMorpion extends JPanel {
    
    JButton[][] cases  = new JButton[3][3];
    JLabel joueur;
    JLabel victoire;
    public VueMorpion() {
        ControleurMorpion controleur = new ControleurMorpion(this);
        this.setLayout(new BorderLayout());
        JPanel nord = new JPanel();
        
        //bloc du haut IHM
        nord.setLayout(new GridLayout(1,2));
        JButton effacer = new JButton("Effacer");
        nord.add(effacer);
        this.joueur = new JLabel("Joueur 1");
        this.joueur.setHorizontalAlignment(SwingConstants.CENTER);
        nord.add(joueur);
        //bloc du haut code
        effacer.addActionListener(controleur);
        
        //bloc du centre
        this.add(nord, BorderLayout.NORTH);
        JPanel centre = new JPanel();
        centre.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j] = new JButton();
                cases[i][j].addActionListener(controleur);
                centre.add(cases[i][j]);
            }    
        }
        
        //bloc du bas
        this.add(centre, BorderLayout.CENTER);
        JLabel resultat = new JLabel();
        this.add(resultat, BorderLayout.SOUTH);
        resultat.setText("La partie commence");
    }
    
    public void afficherResultat(int numeroJoueur){
    	if(numeroJoueur == 1) {
    		this.victoire.setText("Joueur 1 à gagné");
    	}else {
    		this.victoire.setText("Joueur 2 à gagné");
    	}
    }
    
    public void initialiser() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j].setText("");
                cases[i][j].setEnabled(true);
            }
        }
        
    }
    
   public void coordonneeBtCaseGrille(JButton uneCase) {
	   for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if(this.cases[i][j] == uneCase) {
               	System.out.println(i+1+" "+(j+1));
               }
           }
       }
   }
    
    

}