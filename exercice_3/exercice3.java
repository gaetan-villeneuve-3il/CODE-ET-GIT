/**
 * Classe StockManager : permet de gérer le stock des produits.
 */
public class StockManager {

    /**
     * Gère les opérations de stock (ajout ou retrait).
     *
     * @param typeOperation Type d'opération ("ajout" ou "retrait")
     * @param produit        Nom du produit
     * @param quantite       Quantité à ajouter ou retirer
     * @param stock          Stock actuel
     * @return Nouveau stock après l'opération
     */
    public int gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch (typeOperation.toLowerCase()) {
            case "ajout":
                return ajouterStock(produit, quantite, stock);

            case "retrait":
                return retirerStock(produit, quantite, stock);

            default:
                System.out.println("Opération inconnue pour le produit : " + produit);
                return stock;
        }
    }

    /**
     * Ajoute une quantité au stock.
     *
     * @param produit  Nom du produit
     * @param quantite Quantité à ajouter
     * @param stock    Stock actuel
     * @return Nouveau stock après l'ajout
     */
    private int ajouterStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    /**
     * Retire une quantité du stock si suffisant.
     *
     * @param produit  Nom du produit
     * @param quantite Quantité à retirer
     * @param stock    Stock actuel
     * @return Nouveau stock après le retrait
     */
    private int retirerStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }
}