package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethodChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//To handle Illegalestatexception
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to handle ConnectionFaildException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//To Launch chrome browser
	WebDriver	driver=new ChromeDriver(co);
	
	//To maximize the browser
	driver.manage().window().maximize();
	
	//to open the web application or web page
	driver.get("https://www.instagram.com/");
	
	// to stop the screen for 2sec
	Thread.sleep(2000);
	
	//to close the browser
	driver.close();
		
		
	}

}