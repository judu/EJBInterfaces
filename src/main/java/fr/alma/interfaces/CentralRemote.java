package fr.alma.interfaces;

import fr.alma.dto.central.Item;
import fr.alma.dto.catalogue.Categorie;
import fr.alma.dto.central.AProduit;
import java.util.Collection;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author E056449H
 */
@Remote
public interface CentralRemote {

   /**
    * Renvoie la liste des catégories.
    * @return
    */
   public Collection<Categorie> findAllCategories();

   /**
    * Renvoie les produits de la marque <em>marque</em>
    * @param marque
    * @return Les produits de la marque, <em>une collection vide</em> si la marque n'existe pas.
    */
   public Collection<AProduit> findByMarque(String marque);

   /**
    * Renvoie les produits de la catégorie <em>nomCateg</em>
    * @param nomCateg
    * @return les produits de la catégorie, <em>une collection vide</em> si la catégorie n'existe pas.
    */
   public Collection<AProduit> findProduitsByCategorie(String nomCateg);

   /**
    * Renvoie les produits d'une catégorie dans une certaine fourchette de prix.
    * @param nomCateg
    * @param lowPrice
    * @param highPrice
    * @return
    */
   public Collection<AProduit> findByCategorieAndPriceRange(String nomCateg, Double lowPrice, Double highPrice);

   /**
    * Renvoie les produits d'une catégorie fournis par une certaine marque.
    * @param nomCateg
    * @param marque
    * @return
    */
   public Collection<AProduit> findByCategorieAndMarque(String nomCateg, String marque);


   /**
    * Renvoie les produits d'une catégorie, fournis par une certaine marque, dans une certaine fourchette de prix.
    * @param nomCateg
    * @param marque
    * @param lowPrice
    * @param highPrice
    * @return
    */
   public Collection<AProduit> findByCategorieAndMarqueAndPriceRange(String nomCateg, String marque, Double lowPrice, Double highPrice);


   /**
    * Permet de commander un produit.
    * @param panier Les clés sont les produits à acheter, et les valeurs sont les quantités voulues.
    * @return
    */
   public Boolean order(Map<Item, Integer> panier, String nomClient, String adresseClient);
}
