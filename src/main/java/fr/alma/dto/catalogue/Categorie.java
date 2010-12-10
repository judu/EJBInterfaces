/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.alma.dto.catalogue;

import java.io.Serializable;

/**
 *
 * @author judu
 */
public class Categorie implements Serializable {

   private static final Long SerialVersionUID = 1L;

   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
