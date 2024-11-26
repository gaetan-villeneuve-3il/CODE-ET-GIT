public class GestionnaireNotes {
    /*
      @Param NomEtudiant: Nom de l'etudiant
      @Param notes: tableau qui va stokcer les notes de l'eleve
     */

    // Affiche note et moyennes
    public void afficherNotes(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

     public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes){
            int somme = 0;
            for (int note : notes) {
                somme += note;
            }
            // Affichage de la moyenne
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);

        }
    }
}
