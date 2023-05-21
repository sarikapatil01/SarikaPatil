package methodOfWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OuitMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		// To handle IllegaleStatException
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//To launch Firefox browser
	WebDriver	driver=new FirefoxDriver();
	
	// To maximize the browser
	driver.manage().window().maximize();
	
	//to launch web page or web application
	driver.get("http://omayo.blogspot.com/");
	
	//to open launch popup inside the web page
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	
	//to stop the screen 2sec
	Thread.sleep(2000);
	
	//to close the browser as well as all sites
	driver.quit();
	
	}

}
