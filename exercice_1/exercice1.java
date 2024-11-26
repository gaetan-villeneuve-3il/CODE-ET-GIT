/** 
 * la classe FactureManager realise une gestion de facture
 */
public class FactureManager {

    /**
     * Calcule le total d'une facture en appliquant des réductions
     * spécifiques selon le type de produit et le montant total.
     *
     * @param typeProduit  Type du produit (ex : "Alimentaire", "Electronique", "Luxe").
     * @param quantite     Quantité achetée.
     * @param prixUnitaire Prix unitaire du produit.
     * @return Le total final après application des réductions.
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        // Validation des entrées
        if (quantite <= 0 || prixUnitaire <= 0) {
            throw new IllegalArgumentException("Quantité et prix unitaire doivent être positifs.");
        }

        // Calcul initial du montant
        double total = quantite * prixUnitaire;

        // Appliquer la réduction spécifique au type de produit
        total -= total * getReductionParType(typeProduit);

        // Réduction supplémentaire pour les gros montants
        if (total > 1000) {
            total -= total * 0.05; // Réduction de 5%
        }

        return total;
    }

    /**
     * Retourne le pourcentage de réduction applicable selon le type de produit.
     *
     * @param typeProduit Type du produit.
     * @return Le pourcentage de réduction (0.0 si le type est inconnu).
     */
    private double getReductionParType(String typeProduit) {
        switch (typeProduit) {
            case "Alimentaire":
                return 0.05; // Réduction de 5%
            case "Electronique":
                return 0.10; // Réduction de 10%
            case "Luxe":
                return 0.15; // Réduction de 15%
            default:
                return 0.0; // Pas de réduction pour les autres types
        }
    }
}