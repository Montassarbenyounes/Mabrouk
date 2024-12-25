package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	List <WebElement> menus ;
    
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li")
	List <WebElement> Submenus ;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div[2]/div[2]/div/h1")
	WebElement verifpage ;
	
	
	public  HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
		public void mouseHoverOnMenu (String menutiltle, String submenutitle) throws Exception {
			try {
			for (WebElement menu:menus) {
				if (menu.getText().contains(menutiltle)) {
					Config.actions = new Actions(Config.driver);
					Config.actions.moveToElement(menu).perform();
					Thread.sleep(8000);
	}
	}
			for (WebElement submenu:Submenus) {
				if (submenu.getText().contains(submenutitle)) {
					submenu.click();
				}
			}
		}catch (Exception e) {}
		}
		public void veriftitle(String subtitle) {
		    String actualTitle = verifpage.getText();
		    Assert.assertEquals("Chemises & Blouses", subtitle, actualTitle);
		}
}
