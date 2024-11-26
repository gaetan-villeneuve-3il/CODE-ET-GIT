/**
 * Classe GestionnaireNotes
 *classe permettant d'afficher les notes d'un étudiant et de calculer la moyenne.
 */
public class GestionnaireNotes {

    /**
     * Affiche les notes et la moyenne d'un étudiant.
     * 
     * @param nomEtudiant Le nom de l'étudiant
     * @param notes       Les notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNotes(nomEtudiant, notes);
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Affiche les notes d'un étudiant.
     * 
     * @param nomEtudiant Le nom de l'étudiant
     * @param notes       Les notes de l'étudiant
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes.
     * 
     * @param notes Les notes de l'étudiant
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
