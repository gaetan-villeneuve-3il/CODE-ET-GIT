public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // Réductiuon par type de produit
        switch(typeProduit)
        {
            case "Alimentaire": total = this.applyReduction(total, 0.05); break;   // 5%
            case "Electronique": total = this.applyReduction(total, 0.1); break;   // 10%
            case "Luxe": total = this.applyReduction(total, 0.15); break; // 15%
        }

        // Reduction sur le total
        if (this.factureIsGlobalReductable(total)) 
            total = this.applyReduction(total, 0.05);

        return total;
    }

    /**
     * Vérifie si la réduction supplémentaire peut s'appliquer
     */
    private boolean factureIsGlobalReductable(double montant)
    {
        return montant > 1000;
    }

    /**
     * Applicationd de la réduction
     */
    private double applyReduction(double montant, double taux)
    {
        return montant - montant * taux;
    }
}
