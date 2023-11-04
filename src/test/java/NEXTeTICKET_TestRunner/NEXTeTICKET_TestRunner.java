package NEXTeTICKET_TestRunner;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 @CucumberOptions(features= {"src/test/resources/NEXTeTICKETFeatures"},
 plugin = {"json:target/cucumber.json"},
 glue = "NEXTeTICKET_StepDefinition",
 
 // tags={"@Next1"})
 // tags={"@Next2"})
 //tags={"@Next3"})
// tags={"@Next4"})
 tags={"@Next5"})

 public class NEXTeTICKET_TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void NextStartURL() {
	NEXTeTICKET_Base next = new NEXTeTICKET_Base();	
	next.NextBrowser();	
		
	}
	@AfterTest
	public void NextCloseURL() {
	NEXTeTICKET_Base next = new NEXTeTICKET_Base();		
	next.driver.quit();	
		
	}
	
}
