#Author: Montassar

Feature: Cliquer et ajouter au panier
Scenario: Verification des menus de la page dacceuil
Given utilisateur accéde sur la page de produit "CHEMISE ISRA"
When utilisateur clique sur le coleur  la taille "S" et sur ajout au panier 
Then utilisateur vérifie que le produit est ajouter au panier "Voir Le Panier"
