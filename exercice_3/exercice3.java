/**
 * Classe StockManager
 * Cette classe permet de gérer le stock d'un produit en fonction des opérations d'ajout et de retrait
 */
public class StockManager {

    /**
     * Gère le stock en fonction du type d'opération.
     * 
     * @param typeOperation Le type d'opération ("ajout" ou "retrait")
     * @param produit       Le nom du produit
     * @param quantite      La quantité à ajouter ou retirer
     * @param stock         Le stock actuel du produit
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        if (typeOperation.equals("ajout")) {
            ajouterStock(produit, quantite, stock);
        } else if (typeOperation.equals("retrait")) {
            retirerStock(produit, quantite, stock);
        } else {
            System.out.println("Opération inconnue.");
        }
    }

    /**
     * Ajoute la quantité spécifiée au stock.
     * 
     * @param produit  Le nom du produit
     * @param quantite La quantité à ajouter
     * @param stock    Le stock actuel du produit
     */
    private void ajouterStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * Retire la quantité spécifiée du stock si possible.
     * 
     * @param produit  Le nom du produit
     * @param quantite La quantité à retirer
     * @param stock    Le stock actuel du produit
     */
    private void retirerStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
