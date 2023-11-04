package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_EventPageAction;
import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_EventLink extends NEXTeTICKET_Base{
	NEXTeTICKET_HomePageAction nEXTeTICKET_HomePageAction = new NEXTeTICKET_HomePageAction();
	NEXTeTICKET_EventPageAction nEXTeTICKET_EventPageAction = new NEXTeTICKET_EventPageAction();
	
	@Then("^Click on Event link$")
	public void click_on_Event_link() throws Throwable {
		nEXTeTICKET_HomePageAction.ClickonEventlink();  
	}

	@Then("^Verify Event page display$")
	public void verify_Event_page_display() throws Throwable {
		nEXTeTICKET_EventPageAction.VerifyEventpagedisplay();   
	}


	
	
}
