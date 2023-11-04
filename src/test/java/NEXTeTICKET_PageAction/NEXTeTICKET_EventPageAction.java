package NEXTeTICKET_PageAction;

import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_EventPageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_Utiliti;

public class NEXTeTICKET_EventPageAction extends NEXTeTICKET_Base{
	NEXTeTICKET_EventPageLocator nEXTeTICKET_EventPageLocator = new NEXTeTICKET_EventPageLocator();
	
	public void VerifyEventpagedisplay() throws Exception {
		
	Thread.sleep(3000);
	boolean verify = nEXTeTICKET_EventPageLocator.verifyEventPage.isDisplayed();
	Assert.assertTrue(verify);
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "Event Page");
	
	}
	
	
}
