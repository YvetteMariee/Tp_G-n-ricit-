import java.util.Comparator;

public class LivreComparators {
    public static Comparator<Livre> livreParAuteurPuisTitre = new Comparator<Livre>() {
        @Override
        public int compare(Livre l1, Livre l2) {
            int res = l1.getAuteur().compareTo(l2.getAuteur());
            if (res != 0) return res;
            return l1.getTitre().compareTo(l2.getTitre());
        }
    };
}
