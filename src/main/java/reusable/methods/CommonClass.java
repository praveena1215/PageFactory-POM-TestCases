package reusable.methods;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;


public class CommonClass {
	

	public  RemoteWebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 
			driver.manage().window().maximize();
			driver.get("http://www.userfeel.com");
		} catch ( WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser closed due to unknown error");
		}
          takeSnap(driver);
	}
	
	@AfterMethod
	public void closeBrowsers() {
		driver.quit();
	}
	
	public long takeSnap(RemoteWebDriver driver2) throws IOException{
		
		long number = System.currentTimeMillis();
		File temp = driver2.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/tesscase"+number+".png");
		FileUtils.copyFile(temp, dest);
		return number;
	}
	
	
//    public static void takeSnap(WebDriver webdriver,String fileWithPath) throws Exception{
//
//        //Convert web driver object to TakeScreenshot
//
//        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//
//        //Call getScreenshotAs method to create image file
//
//                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//            //Move image file to new destination
//
//                File DestFile=new File("../NewScreenshot/test1.png");
//
//                //Copy file at destination
//
//                FileUtils.copyFile(SrcFile, DestFile);
//
//    }

}
