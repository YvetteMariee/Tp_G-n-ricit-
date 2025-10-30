/*import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // --- Création des médias ---
        Livre livre1 = new Livre("Les Avanturières", 2025, "Thurinne. B", 269);
        Livre livre2 = new Livre("Aller loin", 2003, "Yvy L", 302);
        Livre livre3 = new Livre("Plus malin que le diable", 1960, "Napoleon Hill", 380);
        CD cd1 = new CD("Thriller", 1982, "Michael Jackson", 42);
        CD cd2 = new CD("Strong", 2013, "Anne", 68);
        CD cd3 = new CD("Plenty", 2000, "Burna. B", 74);

        // --- Création de la liste de médias ---
        List<Media> medias = new ArrayList<>(List.of(livre1, livre2, livre3, cd1, cd2, cd3));

        // --- TRI 1 : Tous les médias par année décroissante puis titre ---
        medias.sort(MediaComparators.mediaParAnneePuisTitre);
        System.out.println("=== Médias triés par année décroissante puis titre ===");
        afficherListe(medias);

        // --- TRI 2 : Livres uniquement par auteur puis titre ---
        List<Livre> livres = new ArrayList<>();
        for (Media m : medias) {
            if (m instanceof Livre) {
                livres.add((Livre) m);
            }
        }
        livres.sort(LivreComparators.livreParAuteurPuisTitre);
        System.out.println("\n=== Livres triés par auteur puis titre ===");
        afficherListe(livres);

        System.out.println("\n=== Affichage des détails des médias ===");
        for (Media m : medias) {
            m.afficherDetails(); // Appelle getDescription() selon le type du média
        }

        System.out.println("\n=== Test Empruntable ===");
        for (Media m : medias) {
            if (m instanceof Empruntable) {
                ((Empruntable) m).emprunter();
            }
        }

        // --- Création des membres ---
        Membre m1 = new Membre("Alice", 1);
        Membre m2 = new Membre("Bob", 2);
        Membre m3 = new Membre("Arthur", 3);
        Membre m4 = new Membre("Cather", 4);

        Set<Membre> membres = new HashSet<>(Set.of(m1, m2, m3, m4));
        Map<Membre, List<Media>> emprunts = new HashMap<>();

        // --- Gestion des emprunts ---
        m1.emprunterMedia(livre1);
        m1.emprunterMedia(cd2);
        m2.emprunterMedia(cd1);
        m3.emprunterMedia(livre2);
        m4.emprunterMedia(livre3);
        m4.emprunterMedia(cd3);

        for (Membre m : membres) {
            emprunts.put(m, m.getMediasEmpruntes());
        }

        // --- Affichage des emprunts ---
        System.out.println("\n=== Emprunts des membres ===");
        for (Map.Entry<Membre, List<Media>> entry : emprunts.entrySet()) {
            System.out.println(entry.getKey() + " a emprunté :");
            for (Media media : entry.getValue()) {
                System.out.println("  - " + media);
            }
        }

        //  Méthode générique pour copier une collection
        List<Media> copieMedias = new ArrayList<>();
        copierCollection(medias, copieMedias);
        System.out.println("\n=== Copie de la collection de médias ===");
        afficherListe(copieMedias);

        // Médias empruntés sans doublons
        Set<Media> mediasEmpruntes = new HashSet<>();
        for (List<Media> liste : emprunts.values()) {
            mediasEmpruntes.addAll(liste);
        }
        System.out.println("\n=== Médias empruntés sans doublons ===");
        afficherListe(new ArrayList<>(mediasEmpruntes));

        // Filtrage polymorphe : uniquement les Livres
        List<Media> seulementLivres = filtrer(medias, m -> m instanceof Livre);
        System.out.println("\n=== Médias filtrés : uniquement les Livres ===");
        afficherListe(seulementLivres);
    }

    // --- Méthode générique pour copier une collection ---
    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }

    // --- Méthode pour afficher une liste ---
    public static <T> void afficherListe(List<T> liste) {
        for (T element : liste) {
            System.out.println(element);
        }
    }

    // --- Méthode générique pour filtrer une liste ---
    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T element : liste) {
            if (critere.test(element)) {
                resultat.add(element);
            }
        }
        return resultat;
    }
}
*/

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // --- Création des médias ---
        Livre livre1 = new Livre("Les Avanturières", 2025, "Thurinne. B", 269);
        Livre livre2 = new Livre("Aller loin", 2003, "Yvy L", 302);
        Livre livre3 = new Livre("Plus malin que le diable", 1960, "Napoleon Hill", 380);
        CD cd1 = new CD("Thriller", 1982, "Michael Jackson", 42);
        CD cd2 = new CD("Strong", 2013, "Anne", 68);
        CD cd3 = new CD("Plenty", 2000, "Burna. B", 74);

        // --- Création de la liste de médias ---
        List<Media> medias = new ArrayList<>(List.of(livre1, livre2, livre3, cd1, cd2, cd3));

        // --- TRI 1 : Tous les médias par année décroissante puis titre ---
        medias.sort(MediaComparators.mediaParAnneePuisTitre);
        System.out.println("=== Médias triés par année décroissante puis titre ===");
        afficherListe(medias);

        // --- TRI 2 : Livres uniquement par auteur puis titre ---
        List<Livre> livres = new ArrayList<>();
        for (Media m : medias) {
            if (m instanceof Livre) {
                livres.add((Livre) m);
            }
        }
        livres.sort(LivreComparators.livreParAuteurPuisTitre);
        System.out.println("\n=== Livres triés par auteur puis titre ===");
        afficherListe(livres);

        // Affichage des détails (polymorphisme) ---
        System.out.println("\n=== Affichage des détails des médias ===");
        for (Media m : medias) {
            m.afficherDetails(); // Appelle getDescription() dynamiquement
        }

        // Test Empruntable ---
        System.out.println("\n=== Test Empruntable ===");
        for (Media m : medias) {
            if (m instanceof Empruntable) {
                ((Empruntable) m).emprunter();
            }
        }

        // --- Création des membres ---
        Membre m1 = new Membre("Alice", 1);
        Membre m2 = new Membre("Bob", 2);
        Membre m3 = new Membre("Arthur", 3);
        Membre m4 = new Membre("Cather", 4);

        Set<Membre> membres = new HashSet<>(Set.of(m1, m2, m3, m4));
        Map<Membre, List<Media>> emprunts = new HashMap<>();

        // --- Gestion des emprunts ---
        m1.emprunterMedia(livre1);
        m1.emprunterMedia(cd2);
        m2.emprunterMedia(cd1);
        m3.emprunterMedia(livre2);
        m4.emprunterMedia(livre3);
        m4.emprunterMedia(cd3);

        for (Membre m : membres) {
            emprunts.put(m, new ArrayList<>(m.getMediasEmpruntes()));
        }

        // --- Affichage des emprunts ---
        System.out.println("\n=== Emprunts des membres ===");
        for (Map.Entry<Membre, List<Media>> entry : emprunts.entrySet()) {
            System.out.println(entry.getKey() + " a emprunté :");
            for (Media media : entry.getValue()) {
                System.out.println("  - " + media);
            }
        }

        // --- Méthode générique pour copier une collection ---
        List<Media> copieMedias = new ArrayList<>();
        copierCollection(medias, copieMedias);
        System.out.println("\n=== Copie de la collection de médias ===");
        afficherListe(copieMedias);

        // --- Médias empruntés sans doublons ---
        Set<Media> mediasEmpruntes = new HashSet<>();
        for (List<Media> liste : emprunts.values()) {
            mediasEmpruntes.addAll(liste);
        }
        System.out.println("\n=== Médias empruntés sans doublons ===");
        afficherListe(new ArrayList<>(mediasEmpruntes));

        // --- Filtrage polymorphe : uniquement les Livres ---
        List<Media> seulementLivres = filtrer(medias, m -> m instanceof Livre);
        System.out.println("\n=== Médias filtrés : uniquement les Livres ===");
        afficherListe(seulementLivres);
    }

    // --- Méthode générique pour copier une collection ---
    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }

    // --- Méthode pour afficher une liste ---
    public static <T> void afficherListe(List<T> liste) {
        for (T element : liste) {
            System.out.println(element);
        }
    }

    // --- Méthode générique pour filtrer une liste ---
    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T element : liste) {
            if (critere.test(element)) {
                resultat.add(element);
            }
        }
        return resultat;
    }
}
