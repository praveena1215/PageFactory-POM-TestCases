package pages.userfeel;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.methods.CommonClass;

public class TwitterPage  extends CommonClass {
	
	@FindBy(xpath = "//span[text()='Log in']")
	WebElement logintwitter;
	
	@FindBy(xpath="//input[@id='edit-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='edit-pass']")
	WebElement password;
	
	public RemoteWebDriver driver;
	
	public TwitterPage(RemoteWebDriver argDriver){
		this.driver = argDriver;
		PageFactory.initElements(driver,this);		
	}
	
		
	public TwitterPage clickOnTwitterLogin() throws IOException {
		try {
			logintwitter.click();
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +logintwitter );
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Element is not selectable :" +logintwitter);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error");
		}
		finally {
			takeSnap(driver);
		}
	return this;
		
	}
	
	public TwitterPage enterTheUserid() throws IOException{
		try {
			username.sendKeys("dummycat456");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Element is not selectable :" +username);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error");
		}
		finally {
			takeSnap(driver);		}
		return this;
	}
	
	public TwitterPage enterThePasswrod() throws IOException{
		try {
			password.sendKeys("dreref@123!");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +password);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Element is not selectable :" +password);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error");
		}
		finally {
			takeSnap(driver);
			}
		return this;
	}
	
	public void switchToHomePage() throws IOException{
		Set<String> eachwinid = driver.getWindowHandles();
		for (String firstwinid : eachwinid){
			driver.switchTo().window(firstwinid);
			System.out.println("Display the session id :" + firstwinid);			
			try {
				break;				
			} catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				System.err.println("No such window present");
			}catch (SessionNotCreatedException e) {
				// TODO: handle exception
				System.out.println("Window session not created ");
			}
			finally {
				takeSnap(driver);
			}
			
		}
		
	}
	
	public TwitterPage switchToTwitterPage() {
		// TODO Auto-generated method stub
		Set<String> eachwinid = driver.getWindowHandles();
		for(String lastwinid : eachwinid){
			try {
				driver.switchTo().window(lastwinid);
			} catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				System.err.println("No window present ");
			}catch (SessionNotCreatedException e) {
				// TODO: handle exception
				System.err.println("Window session not created");
			}catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("Browser closed due to unknown error");
			}
			
		}
		
		return this;		
	
		
}


}
