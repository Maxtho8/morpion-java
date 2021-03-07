public enum EtatPartieMorpion {
    JOUEUR1("Joueur 1", 'X'),
    JOUEUR2("Joueur 2", 'O'),
    PARTIE_FINIE("Partie Finie",' ');
    
    String etiquette;
    char remplissageCase;
    
    private EtatPartieMorpion(String etiquette, char remplissageCase) {
        this.etiquette = etiquette;
        this.remplissageCase = remplissageCase;
    }


	public String getEtiquette() {
        return etiquette;
    }

    public char getRemplissageCase() {
        return remplissageCase;
    }
}