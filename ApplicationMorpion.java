import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class ApplicationMorpion extends JFrame {
    
    public ApplicationMorpion() {
        this.setTitle("Jeu de morpion");
        this.setLayout(new GridLayout(1,1));
        this.add(new VueMorpion());
        this.pack();
        this.setVisible(true);
        this.setSize(500, 400);
    }

    public static void main(String[] args) {
        /* look and feel
        setDefaultLookAndFeelDecorated(true);
        try {
           UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.AutumnSkin");
        } catch (Exception e) {
            e.printStackTrace();
        } */
        
        new ApplicationMorpion();
    }

}