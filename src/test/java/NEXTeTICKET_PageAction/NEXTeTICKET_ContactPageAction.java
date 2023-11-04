package NEXTeTICKET_PageAction;

import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_ContactPageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_Utiliti;

public class NEXTeTICKET_ContactPageAction extends NEXTeTICKET_Base{

	
NEXTeTICKET_ContactPageLocator nEXTeTICKET_ContactPageLocator = new NEXTeTICKET_ContactPageLocator();
	
	public void VerifyContactpagedisplay() throws Exception {
	Thread.sleep(3000);
	boolean verify	= nEXTeTICKET_ContactPageLocator.verifyContactPage.isDisplayed();
	Assert.assertTrue(verify);
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "Contact Page");
		
	}
	
	
	
	
}
