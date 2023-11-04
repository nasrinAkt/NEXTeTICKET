package NEXTeTICKET_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;

public class NEXTeTICKET_ContactPageLocator extends NEXTeTICKET_Base {
public NEXTeTICKET_ContactPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@id=\"page-banner-area\"]/div/div/ol/li[2]")
	public WebElement verifyContactPage;
	
}
