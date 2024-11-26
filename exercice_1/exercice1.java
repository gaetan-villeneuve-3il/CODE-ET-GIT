public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        switch (typeProduit) {
            case ("Alimetaire"):
                total -= total * 0.05; // Réduction de 5%
            case ("Electronique"):
                total -= total * 0.1; // Réduction de 10%
            case ("Luxe"):
                total -= total * 0.15; // Réduction de 15%
                // }
         return total;

    }

    public double reductionGros(String typeProduit, int quantite, double prixUnitaire)
        // Reduction sur le total
        double total=CalculerFacture(TypeProduit,quantite,prixUnitaire)
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }
}
