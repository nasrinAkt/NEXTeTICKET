package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_SubscribeToNewsletter extends NEXTeTICKET_Base{
	
	NEXTeTICKET_HomePageAction nEXTeTICKET_HomePageAction = new NEXTeTICKET_HomePageAction();
	
	@Given("^Open Application <\"([^\"]*)\">$")
	public void open_Application(String URL) throws Throwable {
		NextLaunchURL(URL);
	}

	@Then("^Scroll down till Subscribe To Newsletter$")
	public void scroll_down_till_Subscribe_To_Newsletter() throws Throwable {
		nEXTeTICKET_HomePageAction.ScrolldowntillSubscribeToNewsletter();
	}

	@Then("^Verify Subscribe To Newsletter display in Home page footer$")
	public void verify_Subscribe_To_Newsletter_display_in_Home_page_footer() throws Throwable {
		nEXTeTICKET_HomePageAction.VerifySubscribeToNewsletterdisplayinHomepagefooter();
	}

	@Then("^Verify Email field display under Subscribe To Newsletter$")
	public void verify_Email_field_display_under_Subscribe_To_Newsletter() throws Throwable {
		nEXTeTICKET_HomePageAction.VerifyEmailfielddisplayunderSubscribeToNewsletter();
	}

	@Then("^Verify Send button display under Subscribe To Newsletter$")
	public void verify_Send_button_display_under_Subscribe_To_Newsletter() throws Throwable {
		nEXTeTICKET_HomePageAction.VerifySendbuttondisplayunderSubscribeToNewsletter(); 
	}

	@Then("^Enter valid Email$")
	public void enter_valid_Email() throws Throwable {
		nEXTeTICKET_HomePageAction.EntervalidEmail(NextPro.getProperty("NextEmail"));
		
	}

	@Then("^Click Send button$")
	public void click_Send_button() throws Throwable {
		nEXTeTICKET_HomePageAction.ClickSendbutton();  
	}

	@Then("^Verify Success massage\\(Your submission was successful\\) display when send with email$")
	public void verify_Success_massage_Your_submission_was_successful_display_when_send_with_email() throws Throwable {
		nEXTeTICKET_HomePageAction.VerifySuccessmassageYoursubmissionwassuccessfuldisplaywhensendwithemail();  
	}

	@Then("^Keep Email field blank$")
	public void keep_Email_field_blank() throws Throwable {
		nEXTeTICKET_HomePageAction.KeepEmailfieldblank();
	}

	@Then("^Verify Error massage\\(Please fill out this field\\) display when send without email$")
	public void verify_Error_massage_Please_fill_out_this_field_display_when_send_without_email() throws Throwable {
		nEXTeTICKET_HomePageAction.VerifyErrormassPleasefilloutthisfielddisplaywhensendwithoutemail();  
	}


	
	
	
}
