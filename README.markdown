# Interfaces pour le projet d'Objets distribués.


## Description du fonctionnement :

`console
 fr
 `-- alma
     |-- dto
     |   |-- catalogue
     |   |   |-- Categorie.java
     |   |   `-- Produit.java
     |   `-- central
     |       |-- AProduit.java
     |       |-- CProduit.java
     |       `-- Item.java
     `-- interfaces
         |-- CatalogueRegisteringRemote.java
         |-- CatalogueRemote.java
         `-- CentralRemote.java
`


* Le package dto contient les Data Transfert Objects, qui sont des classes définissant les objets qu'on transfère entre les différents serveurs.

*	Le sous-package catalogue est à utiliser pour définir les objets envoyés entre les serveurs de catalogue et le serveur central.

*	Le sous-package central est à utiliser pour définir les objets envoyés entre les serveurs frontaux et le serveur central.

Note : la classe catalogue.Categorie est aussi transmise du central aux frontaux.

Le package interfaces contient les différentes interfaces à implémenter par les serveurs : CatalogueRemote pour un serveur de catalogue, et les deux autres pour le serveur central.

### Serveur catalogue
	
Si vous êtes un serveur catalogue, vous devez d'abord vous enregistrer sur le serveur central. Pour ça, il faut récupérer une référence sur **CatalogueRegisteringRemote**. Pour faire l'appel JNDI dessus, le nom de la classe implémentant l'interface est **CatalogueRegistering**, soit le nom de l'interface, moins le *Remote*.

Les informations demandées pour l'enregistrement sont :
* votre adresse IPv4 soit au format IP:PORT, soit juste IP. Spécifiez le PORT s'il est différent du port JNDI de base, soit 1099 (Si vous n'avez touché à rien par rapport à la configuration de jboss, ne mettez rien.) ; 
* votre nom de fournisseur qui est un nom vous identifiant. Il doit être unique. Vous pouvez mettre vos noms de binôme par exemple ;
* le nom de votre implémentation de l'interface **CatalogueRemote** : vous pouvez mettre "/remote" à la fin ou pas, le central gère les deux.

Le booléen retourné par la méthode *senregistrer* est vrai si ça a fonctionné, et faux dans l'autre cas. Le cas qui peut entraîner une erreur est un catalogue déjà enregistré sous le même nom.


### Serveur frontal

Si vous êtes un serveur frontal, vous faites toutes vos requêtes sur le central. Pour cela, la classe implémentant l'interface **CentralRemote** s'appelle **CentralService**.


## AProduit, CProduit…

Le serveur central fait passer des requêtes aux serveurs catalogues. Or chaque serveur catalogue propose des produits qui peuvent être le même, mais du fournisseur associé, avec un prix spécifique et une quantité différente pour chaque. Pour rassembler ces différents éléments avant d'envoyer aux frontaux, on fournit deux classes : un AProduit (ou produit abstrait) qui contient les informations de base : référence, marque, description ; et un CProduit (ou produit concret) qui contient les informations spécifique à chaque *version* du produit, *i.e.* nom de fournisseur, prix et quantité.

Le schéma est simple :

```text
         1         n..*
AProduit <>--------> Cproduit
```


Un AProduit est envoyé avec une liste de produits fournis.


## Autres informations

Normalement il y a un peu de javadoc, donc générez-la, et jetez-y un œil ;)
