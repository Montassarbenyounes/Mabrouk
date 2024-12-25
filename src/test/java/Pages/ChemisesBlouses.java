package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ChemisesBlouses {
	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/ol/li[3]/span")
	WebElement verifmenu;

	
	
public ChemisesBlouses () {
		PageFactory.initElements(Config.driver, this);
	}

public void ClickProductName (String ProductName){
	Config.attente(10);
	try {
	for(WebElement product:productList) {
		if(product.getText().contains(ProductName)){
			product.click();
			
			
			;
		}
		}
}catch (Exception e) {}}
public void veriftitle(String menu) {
    String actualTitle = verifmenu.getText();
    Assert.assertEquals("Chemises & Blouses", menu, actualTitle);
}

}


