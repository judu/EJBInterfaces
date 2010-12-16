/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.dto.central;

/**
 *
 * @author judu
 */
public class CProduit {

   private Double prix;

   private Integer quantite;

   private String fournisseur;

   public String getFournisseur() {
      return fournisseur;
   }

   public void setFournisseur(String fournisseur) {
      this.fournisseur = fournisseur;
   }

   public Double getPrix() {
      return prix;
   }

   public void setPrix(Double prix) {
      this.prix = prix;
   }

   public Integer getQuantite() {
      return quantite;
   }

   public void setQuantite(Integer quantite) {
      this.quantite = quantite;
   }
}
