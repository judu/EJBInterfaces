/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.interfaces;

import fr.alma.dto.catalogue.Categorie;
import fr.alma.dto.catalogue.Produit;
import java.util.List;
import javax.ejb.Remote;

/**
 * Définit l'interface pour accéder à un catalogue.
 * On doit pouvoir accéder aux produits par différents critères.
 *
 * @author judu
 */
@Remote
public interface CatalogueRemote {

   /**
    * Renvoie la liste des catégories.
    * @return
    */
   public List<Categorie> findAllCategories();


   /**
    * Permet de récupérer les produits d'une marque.
    * @param marque
    * @return
    */
   public List<Produit> findByMarque(String marque);

   /**
    * Permet de récupérer tous les produits classés dans la même catégorie.
    * La catégorie doit être présente en base.
    * @param nomCateg la catégorie des produits voulus.
    * @return
    */
   public List<Produit> findByCategorie(String nomCateg);


   /**
    * Permet de filtrer tous les produits d'une catégorie en fonction de leur prix.
    * Si <em>lowPrice</em> est strictement supérieur à <em>highPrice</em>, la liste retournée doit être vide.
    *
    * @param nomCateg La catégorie des produits voulus.
    * @param lowPrice La borne inférieure de l'intervalle de prix.
    * @param highPrice La borne supérieure de l'intervalle de prix.
    * @return
    */
   public List<Produit> findByCategorieAndPriceRange(String nomCateg, Double lowPrice, Double highPrice);

   public List<Produit> findByCategorieAndMarque(String nomCateg, String marque);

   public List<Produit> findByCategorieAndMarqueAndPriceRange(String nomCateg, String marque, Double lowPrice, Double highPrice);

	public Boolean order(String marque, String model, Integer quantity, String clientName, String clientAddress);
}
