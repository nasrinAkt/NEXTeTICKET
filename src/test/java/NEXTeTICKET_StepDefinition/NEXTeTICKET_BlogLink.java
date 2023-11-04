package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_BlogPageAction;
import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_BlogLink extends NEXTeTICKET_Base{
	
	NEXTeTICKET_HomePageAction nEXTeTICKET_HomePageAction = new NEXTeTICKET_HomePageAction();
	NEXTeTICKET_BlogPageAction nEXTeTICKET_BlogPageAction = new NEXTeTICKET_BlogPageAction();
	
	@Then("^Click on Blog link$")
	public void click_on_Blog_link() throws Throwable {
		nEXTeTICKET_HomePageAction.ClickonBloglink();  
	}

	@Then("^Verify Blog page display$")
	public void verify_Blog_page_display() throws Throwable {
		nEXTeTICKET_BlogPageAction.VerifyBlogpagedisplay(); 
	}


	
	
}
