package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethodEdge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
	WebDriver	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.quit();
	}

}
