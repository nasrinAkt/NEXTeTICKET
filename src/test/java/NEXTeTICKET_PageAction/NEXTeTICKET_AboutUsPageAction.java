package NEXTeTICKET_PageAction;

import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_AboutUsPageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_Utiliti;

public class NEXTeTICKET_AboutUsPageAction extends NEXTeTICKET_Base{

	NEXTeTICKET_AboutUsPageLocator nEXTeTICKET_AboutUsPageLocator = new NEXTeTICKET_AboutUsPageLocator();
	
	public void VerifyAboutuspagedisplay() throws Exception {
	Thread.sleep(3000);	
	boolean verify	= nEXTeTICKET_AboutUsPageLocator.verifyAboutUsPage.isDisplayed();
	Assert.assertTrue(verify);	
	
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "About Us Page");
	}
}
