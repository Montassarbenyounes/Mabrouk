package Testsuites;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ChemisesBlouses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemisesBlousesStepDef {
	@Given("utilisateur accéde sur la page {string}")
	public void utilisateur_accéde_sur_la_page(String string) {
		Config.driver= new ChromeDriver();
		   Config.MaximizeWindow();
		   Config.driver.get("https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/");
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String ProductName) {
		 ChemisesBlouses page = new ChemisesBlouses();
		    page.ClickProductName(ProductName);
	}

	@Then("utilisateur est sur la page de produit {string}")
	public void utilisateur_est_sur_la_page_de_produit(String expectedProductName) {
	    ChemisesBlouses page = new ChemisesBlouses();
	    page.veriftitle(expectedProductName); 
	    
	    
	}
	}

	   

