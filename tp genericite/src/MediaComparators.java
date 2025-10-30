import java.util.Comparator;

public class MediaComparators {
    // Comparateur pour Media
    public static Comparator<Media> mediaParAnneePuisTitre = (m1, m2) -> {
        // On compare d'abord par année décroissante
        int cmp = Integer.compare(m2.getAnneePublication(), m1.getAnneePublication());
        // Si mêmes années, on compare par titre
        if (cmp == 0) {
            cmp = m1.getTitre().compareTo(m2.getTitre());
        }
        return cmp;
    };
}
