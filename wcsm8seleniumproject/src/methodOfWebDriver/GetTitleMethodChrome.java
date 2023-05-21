package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethodChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//To handle IllegaleStatexception
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//To handle ConnectionFaildException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//To launch chrome browser
	WebDriver	driver=new ChromeDriver(co);
	
	//to maximize the chromebrowser
	driver.manage().window().maximize();
	
	//launch web page
	driver.get("https://www.instagram.com/");
	
	//to get title 
	String loginPageTitle = driver.getTitle();
	System.out.println(loginPageTitle);
	
	//to stop the 2sec
	Thread.sleep(2000);
	
	
	
	
	

	}

}
