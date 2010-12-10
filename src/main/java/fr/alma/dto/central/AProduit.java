/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.dto.central;

import fr.alma.dto.catalogue.Categorie;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author judu
 */
public class AProduit {

   /**
    * Marque du produit.
    */
   private String marque;

   /**
    * Modele du produit
    */
   private String modele;

   private String description;

   private Categorie categorie;

   private List<CProduit> produitFournis;

   public Categorie getCategorie() {
      return categorie;
   }

   public void setCategorie(Categorie categorie) {
      this.categorie = categorie;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getMarque() {
      return marque;
   }

   public void setMarque(String marque) {
      this.marque = marque;
   }

   public String getModele() {
      return modele;
   }

   public void setModele(String modele) {
      this.modele = modele;
   }

   public List<CProduit> getProduitFournis() {
      return produitFournis;
   }

   public void setProduitFournis(List<CProduit> produitFournis) {
      this.produitFournis = produitFournis;
   }

   public void addProduitFourni(CProduit produit) {
      if(this.produitFournis == null) {
         this.produitFournis = new LinkedList<CProduit>();
      }
      this.produitFournis.add(produit);
   }

}
