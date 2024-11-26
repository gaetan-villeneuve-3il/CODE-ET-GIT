public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
           
            total=reductionTotal(total,0.05); // Réduction de 5%

        } else if (typeProduit.equals("Electronique")) {
            
            total=reductionTotal(total,0.1); // Réduction de 10%

        } else if (typeProduit.equals("Luxe")) {
             
            total=reductionTotal(total,0.15);// Réduction de 15%
        }

        // Reduction sur le total
        if (total > 1000) {
            
            total=reductionTotal(total,0.05);// Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
    /**
     * foction qui aplique une reduction
     */
    public double reductionTotal(double total,double taux){
          total -= total * taux; 
          return total;
    }
}
