/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.interfaces;

/**
 *
 * @author E056449H
 */
public interface ICProduit {

    String getFournisseur();

    Double getPrice();

    Long getQuantity();

    void setFournisseur(String fournisseur);

    void setPrice(Double price);

    void setQuantity(Long quantity);

}
