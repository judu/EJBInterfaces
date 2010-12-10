package fr.alma.interfaces;

import javax.ejb.Remote;

/**
 *
 * @author judu
 */
@Remote
public interface CatalogueRegisteringRemote {

   /**
    * Permet de s'enregistrer en tant que serveur catalogue auprès du central.
    *
    *
    * @param ip 
    *    adresse du serveur sous la forme IP[:PORT].
    *    Si aucun port n'est spécifié, on considère que c'est 1099 (port par défaut).
    * @param fournisseur nom de fournisseur, ça peut être n'importe quoi, c'est censé être unique
    * @param nomImpl
    *    nom de la classe d'implémentation pour le lookup jndi, pas besoin de mettre le /remote.
    * @return
    */
   public boolean senregistrer(String ip, String fournisseur, String nomImpl);
}
