import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControleurMorpion implements ActionListener {
    
    public VueMorpion vue;
    private ModeleMorpion modele;
    
    public ControleurMorpion (VueMorpion vue) {
        this.vue = vue;
        this.modele = new ModeleMorpion();
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton uneCase = (JButton) event.getSource();
        if (uneCase.getText().contains("Effacer")) {
            this.vue.initialiser();
            this.vue.joueur.setText("Joueur 1");
        } 
        else if(vue.joueur.getText().contains("Joueur 2")){
        	uneCase.setText("O");
            uneCase.setEnabled(false);
            this.vue.joueur.setText("Joueur 1");
        }else {
            uneCase.setText("X");
            uneCase.setEnabled(false);
            this.vue.joueur.setText("Joueur 2");
        }
        this.vue.coordonneeBtCaseGrille(uneCase);
    }

}