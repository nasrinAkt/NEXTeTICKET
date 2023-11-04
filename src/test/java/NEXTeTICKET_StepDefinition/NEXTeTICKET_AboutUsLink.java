package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_AboutUsPageAction;
import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_AboutUsLink extends NEXTeTICKET_Base{
	NEXTeTICKET_HomePageAction nEXTeTICKET_HomePageAction = new NEXTeTICKET_HomePageAction(); 
	NEXTeTICKET_AboutUsPageAction nEXTeTICKET_AboutUsPageAction = new NEXTeTICKET_AboutUsPageAction();
	
	@Then("^Click About Us$")
	public void click_About_Us() throws Throwable {
		nEXTeTICKET_HomePageAction.clickAboutUsLink();
		
		
	}

	@Then("^Verify About us page display$")
	public void verify_About_us_page_display() throws Throwable {
		nEXTeTICKET_AboutUsPageAction.VerifyAboutuspagedisplay();  
	}

}
