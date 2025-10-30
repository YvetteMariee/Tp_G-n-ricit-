public class Livre extends Media implements Empruntable {
    private String auteur;
    private int nbPages;

    // Constructeur
    public Livre(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    // Getters
    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    // Description personnalisée
    @Override
    public String getDescription() {
        return "Livre: " + getTitre() + " par " + auteur + ", " + nbPages + " pages";
    }

    // Méthode pour l'interface Empruntable
    @Override
    public void emprunter() {
        System.out.println("Le livre \"" + getTitre() + "\" a été emprunté.");
    }

    // Pour l'affichage simple dans les listes
    @Override
    public String toString() {
        return getTitre() + " (" + getAnneePublication() + ") - " + auteur;
    }
}
