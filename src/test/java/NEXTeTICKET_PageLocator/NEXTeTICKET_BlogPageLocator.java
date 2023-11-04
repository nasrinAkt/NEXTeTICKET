package NEXTeTICKET_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;

public class NEXTeTICKET_BlogPageLocator extends NEXTeTICKET_Base{

public NEXTeTICKET_BlogPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@id=\"recent-posts-2\"]/h4")
	public WebElement verifyBlogPage;
	
	
	
	
}
