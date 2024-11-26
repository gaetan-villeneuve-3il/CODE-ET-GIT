/**
 * Classe représentant la gestion de stock
 */
public class StockManager {

    /**
     * @param typeOperation le type l'action à exercer sur le stock
     * @param produit nom du produit
     * @param quantite quantite du produit
     * @param stock produits en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        /**
         * Gère les actions d'ajout et de retrait
         */
        switch(action){
            case "ajout":
                stock += quantite;
                System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
                break;
            case "retrait":
                if (stock >= quantite) {
                    stock -= quantite;
                    System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
                } else {
                    System.out.println("Stock insuffisant pour le produit : " + produit);
                }
                break;
            default: System.out.println("Opération inconnue.");
        }
    }
}
