package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {
	
	    private WebDriver driver;
	    private By abtest= By.xpath("//*[@id=\"content\"]/ul/li[1]/a");
	    private By addremoveelement = By.xpath("//*[@id=\"content\"]/ul/li[2]/a");
        private By basicauth=By.xpath("//*[@id=\"content\"]/ul/li[3]/a");
        private By brokenimage=By.xpath("//*[@id=\"content\"]/ul/li[4]/a");
        private By checkbox=By.xpath("//*[@id=\"content\"]/ul/li[6]/a");
        private By dragdropp=By.xpath("//*[@id=\"content\"]/ul/li[5]/a");
        private By contexmenue=By.xpath("//*[@id=\"content\"]/ul/li[7]/a");
        private By byconent=By.xpath("//*[@id=\"hot-spot\"]");
        private By DigestAuthentication =By.xpath("//*[@id=\"content\"]/ul/li[8]/a");
        private By Disappearingelements = By.xpath("//*[@id=\"content\"]/ul/li[9]/a");
        private By home = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a");
        private By dragdrop = By.xpath("//*[@id=\"content\"]/ul/li[10]/a");
        private By inputclick=By.xpath("//*[@id=\"content\"]/ul/li[27]/a");
        private By input = By.xpath("//*[@id=\"content\"]/div/div/div/input");
        private By frames = By.xpath("//*[@id=\"content\"]/ul/li[22]/a");   
        private By hover = By.xpath("//*[@id=\"content\"]/ul/li[25]/a");
        private By alerts = By.xpath("//*[@id=\"content\"]/ul/li[29]/a");
        private By alertclick = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
        private By jsconfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
        private By jsprompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
        
        
	    public WelcomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickABTest() {
	        driver.findElement(abtest).click();
	    }
	    public void clickAddremoveElement() {
	    	driver.findElement(addremoveelement).click();
	    }
	    public void clickbasicauth() {
	    	driver.findElement(basicauth).click();
	    }
	    public void clickbrokenimage() {
	    	driver.findElement(brokenimage).click();
	    }
	    public void clickdragdrop() {
	    	driver.findElement(dragdropp).click();
	    }
	    public void clickcheckbox() {
	    	driver.findElement(checkbox).click();
	    }
	    public void clickcontextmenue() {
	    	driver.findElement(contexmenue).click();
	    }
	    public void clickrec() {
	    	driver.findElement(byconent).click();
	    }
	    public void clickdigestauthentication() {
	    	driver.findElement(DigestAuthentication).click();
	    }
	    public void clickdisappearingelements() {
	    	driver.findElement(Disappearingelements).click();
	    }
	    public void clickhome() {
	    	driver.findElement(home).click();
	    }
	    public void clickdragndrop() {
	    	driver.findElement(dragdrop).click();
	    }
	    public void inclick() {
        	driver.findElement(inputclick).click();
        }
        public void editinput(String entertext) {
        	//driver.findElement(input).click();
        	 WebElement inputField = driver.findElement(input);
        	    inputField.click(); // Click on the input field to make sure it's focused
        	    inputField.clear(); // Clear any existing text in the input field
        	    inputField.sendKeys(entertext); 	
        }
        public void fr() {
        	driver.findElement(frames).click();
        }
        public void hov() {
        	driver.findElement(hover);
        }
       
        public void javaalerts() {
        	driver.findElement(alerts).click();
        }
         public void jal() {
        	 driver.findElement(alertclick).click();
         }
         public void jcon() {
        	 driver.findElement(jsconfirm).click();
         }
         public void jp() {
        	 driver.findElement(jsprompt).click();
         }
}
