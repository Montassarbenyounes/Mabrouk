package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	@Given("utilisateur est sur la page dacceuil Mabrouk")
	public void utilisateur_est_sur_la_page_dacceuil_mabrouk() {
		Config.driver = new ChromeDriver();
	    Config.driver.manage().window().maximize();
	    Config.driver.get("https://mabrouk.tn/"); 

	
	}
	
	

	@When("utilisateur survole le souris sur le menu {string} de page dacceuil et clique sur le submenu {string}")
	public void utilisateur_survole_le_souris_sur_le_menu_de_page_dacceuil_et_clique_sur_le_submenu(String menutitle, String submenutitle ) throws Exception {
		HomePage page = new HomePage();
		page.mouseHoverOnMenu(menutitle, submenutitle);
	}
		
	@Then("utilisateur est diregé vers la page de submenu {string}")
	public void utilisateur_est_diregé_vers_la_page_de_submenu(String veriftitle) {
		HomePage page = new HomePage();
	    page.veriftitle(veriftitle);
	}

}

	    
	


	

	