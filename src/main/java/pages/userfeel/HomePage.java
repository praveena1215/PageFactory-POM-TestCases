package pages.userfeel;

import java.io.IOException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.methods.CommonClass;

public class HomePage extends CommonClass {
	
	@FindBy(xpath="//a [@class='ctools-use-modal ctools-modal-userfeel-login ctools-use-modal-processed']")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//input [@id='edit-name']")
	WebElement userid;
		
	@FindBy(xpath="//input [@id='edit-pass']")
	WebElement password;
	
	@FindBy(xpath="//a [text()='REGISTER AS A TESTER']")
	WebElement registerastester;
	
	@FindBy(xpath="//input[@id='edit-pass-pass2']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//a[@class='icon twitter']")
	WebElement clicktwittericon;

	public RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver argDriver){
		this.driver = argDriver;
		PageFactory.initElements(driver , this);
	}
	
	
	
	public HomePage clickOnLogonIcon() throws IOException{
		try {
			loginbutton.click();
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +loginbutton);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element :" +loginbutton);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error:" +loginbutton);
		}
		finally {
			takeSnap(driver);
		}
			
		
		return this;
	}
	
	public HomePage enterUserId(String value) throws IOException{
		try {
			userid.sendKeys(value);
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +userid);			
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element :" +userid);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error:" +userid);
		}
		finally {
			takeSnap(driver);
		}
		return this;
	}
	
	public HomePage enterPassword(String value) throws IOException{
		try {
			password.sendKeys(value);
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +password);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element :" +password);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error:" +password);
		}
		finally {
			takeSnap(driver);
		}
		return this;
	}
	
	public HomePage clickOnTester() throws IOException{
		try {
			registerastester.click();
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable :" +registerastester);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element :" +registerastester);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error:" +registerastester);
		}
		finally {
			takeSnap(driver);
		}
		return this;
		
	}
	
	public HomePage pageDown() throws IOException{
		try {
			confirmpassword.sendKeys(Keys.PAGE_DOWN);
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch blockcon
			System.err.println("Element is not interactable :" +confirmpassword);
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element :" +confirmpassword);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error:" +confirmpassword);
		}
		finally {
			takeSnap(driver);
		}
		return this;
		
	}
	
	public TwitterPage clickOnTwitterIcon() throws IOException{
		try {
			clicktwittericon.click();
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not interactable " +clicktwittericon);
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Element is not selectable :" +clicktwittericon);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser closed due to unknown error");
		}
		finally {
			takeSnap(driver);
		}
		return new TwitterPage(driver);
	}
	
		
	
}
