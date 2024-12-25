package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class Achatproduit {

	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[2]")
	WebElement coleur ;
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[1]")
	WebElement taille ;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement Ajoutpanier ;
	
	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
	WebElement verifpanier ;
	
	public Achatproduit () {
		PageFactory.initElements(Config.driver, this);
	}

public void ClickProductName (String ProductName){
	Config.attente(10);
	coleur.click();
	Config.attente(10);
	taille.click();
	Config.attente(10);
	
	try {
	    Ajoutpanier.click();
	} catch (ElementClickInterceptedException e) {
	    System.out.println("Element not clickable: " + e.getMessage());
	}

	JavascriptExecutor js = (JavascriptExecutor) Config.driver;
	js.executeScript("arguments[0].click();", Ajoutpanier);

}
public void verification(String produitName) {
	WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
	String actualText = wait.until(ExpectedConditions.visibilityOf(verifpanier)).getText();
	String actualtext= verifpanier.getText();
	Assert.assertEquals(produitName, actualtext);

}

}	
			

