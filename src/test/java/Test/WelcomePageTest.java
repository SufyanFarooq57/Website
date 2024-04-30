package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.WelcomePage;

public class WelcomePageTest extends BaseClass{
	 private WelcomePage welcome;
     
	    @BeforeMethod
	    public void setUp() {
	        super.setup();
	        welcome = new WelcomePage(driver);
	    }

	    @Test
	    public void testAB() {
	        // Your test logic here
	    	welcome.clickABTest();
	    	
	    }
	    @Test
	    public void addremove() {
	    	welcome.clickAddremoveElement();
	    }
	    @Test
	    public void basicauth() {
	    	welcome.clickbasicauth();
	    }
	    @Test
	    public void brokenimage() {
	    	welcome.clickbrokenimage();
	    }
	    @Test
	    public void challengeDOM() {
	    	welcome.clickdragdrop();
	    }
        @Test
        public void welcome() {
        	 String pageHeaderText = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
             // Assert that the page header text matches the expected value
             Assert.assertEquals(pageHeaderText, "Welcome to the-internet", "Page header text doesn't match");
        }
        @Test 
        public void avaiable() {
        	String pageavailabe= driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).getText();
        	Assert.assertEquals(pageavailabe, "Available Examples","Page header text doesn't match");
        }
        @Test
        public void hrefAB(){
        	String pageabtest=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a")).getText();
        	Assert.assertEquals(pageabtest, "A/B Testing","Page header text doesn't match");
        	
        }
        @Test 
        public void ABtestcontrol() {
        welcome.clickABTest();
      	String pageabtestcontrol = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        Assert.assertEquals(pageabtestcontrol,"A/B Test Control","Page header text doesn't match");
        
           
        }
        @Test
        public void imagecheck() {
        	
        	welcome.clickbrokenimage();
        	WebElement imageElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
        	String imageSrc = imageElement.getAttribute("src");

            // Verify if the src attribute is not null or empty
            if (imageSrc == null || imageSrc.isEmpty()) {
                System.out.println("Image source is null or empty");
            } else {
                System.out.println("Image source is not null or empty: " + imageSrc);
            }
            
        	
        }
        @Test
        public void imagenotblanck() {
        	
        	 welcome.clickbrokenimage(); // Assuming welcome is an instance of your page class where you define your page objects

             // Find the image element using XPath
             WebElement imageElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));

             // Get the value of the src attribute
             String imageSrc = imageElement.getAttribute("src");

             // Verify if the src attribute is not null or empty
             if (imageSrc == null || imageSrc.isEmpty()) {
                 System.out.println("Image source is null or empty");
             } else {
                 System.out.println("Image source is not null or empty: " + imageSrc);
             }
        }
        
        @Test
        public void checkbox() {
        	
        	welcome.clickcheckbox();
        	WebElement checkboxElement = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")); // Replace "checkboxId" with the actual ID of your checkbox

            // Verify the state of the checkbox
            boolean isChecked = checkboxElement.isSelected();

            // Assert that the checkbox is checked or unchecked based on your expectation
            Assert.assertTrue(isChecked, "Checkbox is checked");
          
        }
     @Test
     public void checkcontextmenue() {
    	
    	welcome.clickcontextmenue();
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]")); // Replace "elementId" with the actual ID of the element
        
        // Create Actions class instance
        Actions actions = new Actions(driver);
        
        // Perform right-click action on the element
        actions.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        
        // Assert the text of the alert
        Assert.assertEquals(alertText, "You selected a context menu", "Alert text doesn't match expected");
        
        // Dismiss or accept the alert (based on your scenario)
        alert.dismiss(); 
     }
    
     @Test
     public void checkdisappearingelemnts() {
    	 welcome.clickdisappearingelements();
    	 String pageabtestcontrol = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
         Assert.assertEquals(pageabtestcontrol,"Disappearing Elements","Page header text doesn't match");
         welcome.clickhome();
     }
     @Test
     public void checkdragdrop() {
    	 welcome.clickdragndrop();
    	  // Find the source element (element to be dragged)
    	  WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));

          // Find the target element (element to drop onto)
          WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));

          // Perform drag and drop operation
          Actions actions = new Actions(driver);
          actions.dragAndDrop(sourceElement, targetElement).build().perform();

          // Verify that the drag and drop was successful
       /*   String actualText = targetElement.getText();
          String expectedText = "Dropped!";
          Assert.assertEquals(expectedText, actualText);   */
    	 
     }
     
     @Test
     public void input() {
        welcome.inclick();
    	welcome.editinput("098");
     }
     
       @Test
       public void frq() {
	   welcome.fr();
   }
     @Test
     public void hvr() {
    	 welcome.hov();
     }
    @Test
     public void javaal() {
    	 welcome.javaalerts();
    	 welcome.jal();
    	 Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();

         // Assert that the alert text is "I am a JS Alert"
       //  Assert.assertEquals("I am a JS Alert", alertText);
         System.out.println(" " + alertText);
         // Dismiss the alert
         alert.accept();
              
         // Close the browser
        
     }
    @Test
    public void jj() {
    	 welcome.javaalerts();
    	 welcome.jcon();
    	 Alert alert = driver.switchTo().alert();
    	 String alertText = alert.getText();
    	 System.out.println(""+ alertText);
    	 alert.accept();
    }
     
    @Test
    public void sf() {
    	welcome.javaalerts();
    	welcome.jp();
    }
    
          
	    @AfterMethod
	    public void tearDown() {
	        super.tearDown();
	    }
	    
}
