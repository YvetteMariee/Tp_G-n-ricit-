/*public class CD extends Media {
    private String artiste;
    private int duree; // en minutes

    // Constructeur
    public CD(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        this.artiste = artiste;
        this.duree = duree;
    }

    // Getter pour artiste (facultatif, mais utile)
    public String getArtiste() {
        return artiste;
    }

    // Getter pour durée (facultatif)
    public int getDuree() {
        return duree;
    }

    // Implémentation obligatoire de getDescription() selon la consigne
    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    // toString pour affichage dans le tri
    @Override
    public String toString() {
        return getTitre() + " (" + getAnneePublication() + ") - " + artiste;
    }
}
*/

public class CD extends Media implements Empruntable {
    private String artiste;
    private int duree;

    public CD(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        this.artiste = artiste;
        this.duree = duree;
    }

    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    @Override
    public void emprunter() {
        System.out.println("Le CD \"" + getTitre() + "\" a été emprunté.");
    }
}
