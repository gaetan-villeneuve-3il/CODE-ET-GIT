/**
 * Classe GestionnaireNotes : permet de gérer les notes des étudiants
 * et de calculer leur moyenne.
 */
public class GestionnaireNotes {

    /**
     * Affiche les notes et la moyenne d'un étudiant.
     *
     * @param nomEtudiant Nom de l'étudiant
     * @param notes Tableau des notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        if (notes == null || notes.length == 0) {
            System.out.println("Aucune note disponible pour " + nomEtudiant + ".");
            return;
        }

        // Affichage des notes
        afficherNotes(nomEtudiant, notes);

        // Calcul et affichage de la moyenne
        double moyenne = calculerMoyenne(notes);
        System.out.printf("Moyenne de %s : %.2f%n", nomEtudiant, moyenne);
    }

    /**
     * Affiche les notes d'un étudiant.
     *
     * @param nomEtudiant Nom de l'étudiant
     * @param notes Tableau des notes
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + " :");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes.
     *
     * @param notes Tableau des notes
     * @return La moyenne des notes
     */
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}