package fr.alma.interfaces;


import java.util.List;
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
   public List<IFrontCategorie> findAllCategories();


   public List<IAProduit> findProduitsByCategorie(IFrontCategorie categ);

   public List<IAProduit> findByCategorieAndPriceRange(IFrontCategorie categorie, Double lowPrice, Double highPrice);

   public List<IAProduit> findByCategorieAndMarqueAndPriceRange(ICategorie categorie, String maruqe, Double lowPrice, Double highPrice);

   public Boolean order(Map<IItem, Long> panier);
}
