public abstract class Media {
    private String titre;
    private int anneePublication;

    public Media(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    public String getTitre() { return titre; }
    public int getAnneePublication() { return anneePublication; }

    public abstract String getDescription(); // déjà existante

    // Nouvelle méthode non abstraite pour l'étape 7
    public void afficherDetails() {
        System.out.println(getDescription());
    }
}
