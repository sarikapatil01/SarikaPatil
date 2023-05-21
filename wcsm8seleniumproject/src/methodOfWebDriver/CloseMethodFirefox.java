package methodOfWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMethodFirefox {

	public static void main(String[] args) throws InterruptedException {
			
		//to handle IllegaleStatException
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		
		//to launch firefox Browser
	WebDriver	driver=new FirefoxDriver();
	
	//to maximize the browser
	driver.manage().window().maximize();

	//to open webapplication or web page
	driver.get("https://www.instagram.com/");
	
	//to stop the screen for 2sec
	Thread.sleep(2000);
	
	//to close the browser
	driver.close();
	
	
		
		
	}

}
