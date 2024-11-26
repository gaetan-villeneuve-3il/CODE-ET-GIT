public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {

        this.showNotes(nomEtudiant, notes);
        
        System.out.println("Moyenne : " + this.moyennesNotes(notes));
    }

    /**
     * Affichage des notes
     */
    private void showNotes(String nomEtudiant, int[] notes)
    {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule de la somme des notes
     */
    private int sumNotes(int[] notes)
    {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        return somme;
    }

    /**
     * Calcule de la moyenne des notes
     */
    private double moyennesNotes(int[] notes)
    {
        return (double) this.sumNotes(notes) / notes.length;
    }
}
