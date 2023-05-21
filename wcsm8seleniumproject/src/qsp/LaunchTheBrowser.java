package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To avoid IllegalStatException
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//To avoid ConnectionFaildException
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	//To launch ChromeBrowser
	WebDriver	driver=new ChromeDriver(co);
	
	//To maximize the ChromeBrowser
	driver.manage().window().maximize();
	
	//To Stop the screen for 2sec
	Thread.sleep(2000);
	
	//To Close the ChromeBrowser
	driver.close();
	
	
	

	}

}
