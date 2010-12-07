/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.interfaces;

/**
 * C'est maintenant une classe pour pouvoir l'instancier côté client.
 * @author E056449H
 */
public class IItem {

   private String fournisseur;

   private String marque;

   private String model;

   public String getFournisseur() {
      return fournisseur;
   }

   public void setFournisseur(String fournisseur) {
      this.fournisseur = fournisseur;
   }

   public String getMarque() {
      return marque;
   }

   public void setMarque(String marque) {
      this.marque = marque;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   
}
