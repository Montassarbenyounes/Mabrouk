package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.Achatproduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ajoutpanier {

	
	
	@Given("utilisateur accéde sur la page de produit {string}")
	public void utilisateur_accéde_sur_la_page_de_produit(String string) {
		Config.driver = new ChromeDriver();
	    Config.driver.manage().window().maximize();
	    Config.driver.get("https://mabrouk.tn/produit/chemise-isra/"); 

	}

	@When("utilisateur clique sur le coleur  la taille {string} et sur ajout au panier")
	public void utilisateur_clique_sur_le_coleur_la_taille_et_sur_ajout_au_panier(String ProductName) {
	   Achatproduit produit= new Achatproduit () ;
			   produit.ClickProductName(ProductName);
	}

	@Then("utilisateur vérifie que le produit est ajouter au panier {string}")
	public void utilisateur_vérifie_que_le_produit_est_ajouter_au_panier(String produitName) {
	    Achatproduit produit = new Achatproduit();
	    produit.verification(produitName);
	}



	}
