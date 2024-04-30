package Base;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	 protected static WebDriver driver;
 
	    public void setup() {
	  
	    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
	          driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("https://the-internet.herokuapp.com/");
	         
	         
	  
	    
	    }
      
	    public void tearDown() {
	       
	    }
}
 