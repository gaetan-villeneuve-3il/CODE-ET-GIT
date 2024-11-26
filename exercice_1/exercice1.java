public class FactureManager {

    /**
     * Calcule le total d'une facture après application des réductions.
     * 
     * @param typeProduit  Le type du produit (Alimentaire, Electronique, Luxe)
     * @param quantite     La quantité achetée
     * @param prixUnitaire Le prix unitaire du produit
     * @return Le total après application des réductions
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // Application de la réduction par type de produit
        double reductionParType = calculerPourcentageReductionParType(typeProduit) * total;
        total -= reductionParType;

        // Application de la réduction supplémentaire pour les gros montants
        total -= calculerReductionSupplementaire(total);

        return total; // Retourne le total final après toutes les réductions
    }

    /**
     * Retourne le pourcentage de réduction en fonction du type de produit.
     * 
     * @param typeProduit Le type du produit
     * @return Le pourcentage de réduction (0.05 pour 5%, etc.)
     */
    private double calculerPourcentageReductionParType(String typeProduit) {
        return switch (typeProduit) {
            case "Alimentaire" -> 0.05; // 5% pour les produits alimentaires
            case "Electronique" -> 0.1; // 10% pour les produits électroniques
            case "Luxe" -> 0.15; // 15% pour les produits de luxe
            default -> 0; // Pas de réduction pour les autres types
        };
    }

    /**
     * Calcule une réduction supplémentaire pour les gros montants.
     * 
     * @param total Le total actuel
     * @return Le montant de la réduction supplémentaire
     */
    private double calculerReductionSupplementaire(double total) {
        return total > 1000 ? total * 0.05 : 0; // Réduction de 5% si le total dépasse 1000
    }
}
