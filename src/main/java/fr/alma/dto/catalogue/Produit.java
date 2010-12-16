package fr.alma.dto.catalogue;

import java.io.Serializable;

/**
 * Cette classe servira à échanger des produits entre les catalogues et le serveur central.
 * @author judu
 */
public class Produit implements Serializable {


   private static final Long SerialVersionUID = 1L;

   /**
    * Marque du produit.
    */
   private String marque;

   /**
    * Modele du produit
    */
   private String modele;

   private String description;

   private Double prix;

   private Categorie categorie;

   private Integer quantite;

   public Integer getQuantite() {
      return quantite;
   }

   public void setQuantite(Integer quantite) {
      this.quantite = quantite;
   }

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

   public Double getPrix() {
      return prix;
   }

   public void setPrix(Double prix) {
      this.prix = prix;
   }

   /**
    * On ne compare ici que la marque et le modèle qui forment une clé métier de l'objet produit.
    * @param obj
    * @return
    */
   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Produit other = (Produit) obj;
      if ((this.marque == null) ? (other.marque != null) : !this.marque.equals(other.marque)) {
         return false;
      }
      if ((this.modele == null) ? (other.modele != null) : !this.modele.equals(other.modele)) {
         return false;
      }
      if (this.categorie != other.categorie && (this.categorie == null || !this.categorie.equals(other.categorie))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 71 * hash + (this.marque != null ? this.marque.hashCode() : 0);
      hash = 71 * hash + (this.modele != null ? this.modele.hashCode() : 0);
      hash = 71 * hash + (this.categorie != null ? this.categorie.hashCode() : 0);
      return hash;
   }
}
