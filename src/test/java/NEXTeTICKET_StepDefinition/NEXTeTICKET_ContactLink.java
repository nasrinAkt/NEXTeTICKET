package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_ContactPageAction;
import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_ContactLink extends NEXTeTICKET_Base{
	NEXTeTICKET_HomePageAction nEXTeTICKET_HomePageAction = new NEXTeTICKET_HomePageAction();
	NEXTeTICKET_ContactPageAction nEXTeTICKET_ContactPageAction = new NEXTeTICKET_ContactPageAction();
	
	@Then("^Click on Contact link$")
	public void click_on_Contact_link() throws Throwable {
		nEXTeTICKET_HomePageAction.ClickonContactlink();   
	}

	@Then("^Verify Contact page display$")
	public void verify_Contact_page_display() throws Throwable {
		nEXTeTICKET_ContactPageAction.VerifyContactpagedisplay(); 
	}


	
	
	
}
