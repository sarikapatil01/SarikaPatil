package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To avoid IllegaleStatException
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//To LaunchFireFox Browser
	WebDriver	driver=new FirefoxDriver();
	
	//To maximize the Firefox browseer
	driver.manage().window().maximize();
	
	//TO stop the screen for 2sec
	Thread.sleep(2000);
	
	//To close the FireFox Browser
	driver.close();
	}

}
