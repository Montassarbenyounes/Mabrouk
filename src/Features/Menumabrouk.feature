#Author: Montassar
Feature: 
Scenario: Verification des menus de la page dacceuil
Given utilisateur est sur la page dacceuil Mabrouk
When utilisateur survole le souris sur le menu "Femme" de page dacceuil et clique sur le submenu "Chemises & Blouses"
Then utilisateur est diregé vers la page de submenu "Chemises & Blouses"
