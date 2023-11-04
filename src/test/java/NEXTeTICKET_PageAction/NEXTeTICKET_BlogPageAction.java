package NEXTeTICKET_PageAction;

import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_BlogPageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_Utiliti;

public class NEXTeTICKET_BlogPageAction extends NEXTeTICKET_Base{

	NEXTeTICKET_BlogPageLocator nEXTeTICKET_BlogPageLocator = new NEXTeTICKET_BlogPageLocator();
	
	public void VerifyBlogpagedisplay() throws Exception {
		
	Thread.sleep(3000);
    boolean verify = nEXTeTICKET_BlogPageLocator.verifyBlogPage.isDisplayed();	
	Assert.assertTrue(verify);
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "Blog Page");
		
	}
}
