package NEXTeTICKET_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class NEXTeTICKET_Base {

	public static WebDriver driver;
	public static Properties NextPro;
	
public NEXTeTICKET_Base() {	
	try {
		FileInputStream nextFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//NEXTeTICKET_Config//NEXTeTICKET_Config.Properties"));
		NextPro = new Properties();
		NextPro.load(nextFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
  public void NextBrowser() {	
	
    String NextAllBrowsers	= NextPro.getProperty("NextBrowser1");
	
    if(NextAllBrowsers.equalsIgnoreCase("Chrome")) {
	
   System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//NEXTeTICKET_ChromeDriver//chromedriver.exe"));
   ChromeOptions rom = new ChromeOptions();
   rom.addArguments("--remote-allow-origins=*"); 
   driver = new ChromeDriver();
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utiliti.pageLoadTimeout));
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utiliti.implicitlyWait));
   driver.manage().window().maximize();	
	
}
    else if(NextAllBrowsers.equalsIgnoreCase("Edge")) {
    System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//NEXTeTICKET_EdgeDriver//msedgedriver.exe"));
    EdgeOptions rom1 = new EdgeOptions();
    rom1.addArguments("--remote-allow-origins=*"); 
    driver = new EdgeDriver();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utiliti.pageLoadTimeout));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utiliti.implicitlyWait));
    driver.manage().window().maximize();	
    		
    	
    	
    }
    
    
    
}
	public static void NextLaunchURL(String URL) {
		driver.get(NextPro.getProperty("NextURL"));
		
		
	}
	
	
	
}
