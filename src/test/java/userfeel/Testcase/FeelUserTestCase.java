package userfeel.Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.userfeel.HomePage;
import reusable.methods.CommonClass;

public class FeelUserTestCase extends CommonClass {	
	
	//public RemoteWebDriver driver;
	@Test
	public void executeTestcase() throws IOException{
		new HomePage(driver)
		.clickOnLogonIcon()
		.enterUserId("dummy123@gmail.com")
		.enterPassword("dummy123")
		//.pageDown()
		.clickOnTester()
		.pageDown()
		.clickOnTwitterIcon()
		.switchToTwitterPage()
		.clickOnTwitterLogin()
		.enterTheUserid()
		.enterThePasswrod()
		.switchToHomePage();	
		
	}

}
