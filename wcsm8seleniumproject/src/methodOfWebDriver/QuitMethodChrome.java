package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class QuitMethodChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//to handle IllegaleStatException
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to handle connection faild exception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//to launch chromebrowser
	WebDriver	driver=new ChromeDriver(co);
	
	//to maximize the browser
	driver.manage().window().maximize();
	
	//to open the web application
	driver.get("http://omayo.blogspot.com/");
	
	//to launch web element
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	

	
	//to stop the screen for 2sec
	Thread.sleep(2000);
	
	//to quit the browser
	driver.quit();
	
	}

}
