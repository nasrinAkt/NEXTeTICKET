package NEXTeTICKET_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_HomePageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_TestData;
import NEXTeTICKET_Utility.NEXTeTICKET_Utiliti;

public class NEXTeTICKET_HomePageAction extends NEXTeTICKET_Base{

	NEXTeTICKET_HomePageLocator nEXTeTICKET_HomePageLocator = new NEXTeTICKET_HomePageLocator();
	
	public void ScrolldowntillSubscribeToNewsletter() {
		((JavascriptExecutor)driver).executeScript("scroll(0,8100)");
		
		
	}
	public void VerifySubscribeToNewsletterdisplayinHomepagefooter() throws Exception {
		Thread.sleep(3000);
		boolean verification = nEXTeTICKET_HomePageLocator.verifySubsNews.isDisplayed();
		Assert.assertTrue(verification);
		NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "Subscribe to newsletter");
		
	}
	
	public void VerifyEmailfielddisplayunderSubscribeToNewsletter() throws Exception {
	Thread.sleep(3000);
	boolean verifyEmailField = nEXTeTICKET_HomePageLocator.email.isDisplayed();
	Assert.assertTrue(verifyEmailField);
	}
	
	public void VerifySendbuttondisplayunderSubscribeToNewsletter() throws Exception {
		
	Thread.sleep(3000);	
	boolean sendField = nEXTeTICKET_HomePageLocator.sendButton.isDisplayed();
	Assert.assertTrue(sendField);
	
	}
	public void EntervalidEmail(String u) {
	nEXTeTICKET_HomePageLocator.email.sendKeys(u);	
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "send email");
		
	}
	public void ClickSendbutton() {
	nEXTeTICKET_HomePageLocator.sendButton.click();	
		
	}
	
	public void VerifySuccessmassageYoursubmissionwassuccessfuldisplaywhensendwithemail() throws Exception {
	Thread.sleep(3000);
	boolean verifysuccessM = nEXTeTICKET_HomePageLocator.successMassage.isDisplayed();
	Assert.assertTrue(verifysuccessM);
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "successMassage");
		
	}
	public void KeepEmailfieldblank() {
	nEXTeTICKET_HomePageLocator.email.sendKeys(NEXTeTICKET_TestData.nullValue);
		
	}
	
	
	public void VerifyErrormassPleasefilloutthisfielddisplaywhensendwithoutemail() throws Exception {
	Thread.sleep(3000);
	boolean errorMassage = nEXTeTICKET_HomePageLocator.sendButton.isDisplayed();
	Assert.assertTrue(errorMassage);
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "errorMassage");
	}
	
		
	
	public void ClickonHomeLink() {
	nEXTeTICKET_HomePageLocator.ClHome.click();	
		
		
	}
	public void Verifyhomepagedisplay() throws Exception {
	Thread.sleep(3000);
	boolean verification = nEXTeTICKET_HomePageLocator.verifyHomePage.isDisplayed();	
	Assert.assertTrue(verification);	
	NEXTeTICKET_Utiliti.takeMyScreenshot(driver, "Home page verify");	
	}
	public void clickAboutUsLink() {
		nEXTeTICKET_HomePageLocator.ClAboutUs.click();
	}
	
	public void ClickonContactlink() {
	nEXTeTICKET_HomePageLocator.clContact.click();
		
	}
	
	public void ClickonEventlink() {
	nEXTeTICKET_HomePageLocator.clEvent.click();
		
	}
	public void ClickonBloglink() {
	nEXTeTICKET_HomePageLocator.ClBlog.click();	
		
	}
	
}
