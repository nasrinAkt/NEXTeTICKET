package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_HomeLink extends NEXTeTICKET_Base{
	 NEXTeTICKET_HomePageAction  nEXTeTICKET_HomePageAction  = new  NEXTeTICKET_HomePageAction();
	
	

	@Then("^Click on Home Link$")
	public void click_on_Home_Link() throws Throwable {
		
		nEXTeTICKET_HomePageAction.ClickonHomeLink();
	    
	}

	@Then("^Verify home page display$")
	public void verify_home_page_display() throws Throwable {
		nEXTeTICKET_HomePageAction.Verifyhomepagedisplay();
		
	    
	}


	
	
}
