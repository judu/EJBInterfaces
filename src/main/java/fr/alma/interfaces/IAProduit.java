/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.interfaces;

import java.util.List;

/**
 *
 * @author E056449H
 */
public interface IAProduit {

    String getBrand();

    String getDescription();

    String getModel();

    List<ICProduit> getProvidedProduits();

    void setBrand(String brand);

    void setDescription(String description);

    void setModel(String model);

    void setProvidedProduits(List<ICProduit> providedProduits);

}
