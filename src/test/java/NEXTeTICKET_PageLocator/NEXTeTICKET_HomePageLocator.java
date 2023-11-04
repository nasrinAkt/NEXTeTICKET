package NEXTeTICKET_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;

public class NEXTeTICKET_HomePageLocator extends NEXTeTICKET_Base{

	public NEXTeTICKET_HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="/html/body/div[2]/section[13]/div/div/div/div[2]/div/h2")
	public WebElement verifySubsNews;
	
	@FindBy(id ="form-field-email")
	public WebElement email;
	
	@FindBy(xpath ="/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div/div[2]/button/span/span[2]")
	public WebElement sendButton;
	
	@FindBy(xpath ="/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div[2]")
	public WebElement successMassage;
	
	
	
	@FindBy(linkText ="Home")
	public WebElement ClHome;
	
	@FindBy(linkText ="About Us")
	public WebElement ClAboutUs;
	
	@FindBy(xpath ="/html/body/div[2]/section[1]/div[3]/div[1]/div/div[2]/div/h1")
	public WebElement verifyHomePage;
	
	@FindBy(linkText ="Contact")
	public WebElement clContact;
	
	@FindBy(linkText ="Event")
	public WebElement clEvent;
	
	@FindBy(linkText ="Blog")
	public WebElement ClBlog;
	
}
