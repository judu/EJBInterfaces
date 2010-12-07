/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.interfaces;

import javax.ejb.Remote;

/**
 *
 * @author judu
 */
@Remote
public interface CatalogueRegisteringRemote {

   public boolean senregistrer(String ip, String fournisseur, String nomImpl);

}
