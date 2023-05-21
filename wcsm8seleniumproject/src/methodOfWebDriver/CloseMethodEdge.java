package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseMethodEdge {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to handle IllegaleStatException
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		//to launch Edge Browser
	WebDriver	driver=new EdgeDriver();
	
	//to maximize Edge Browser
	driver.manage().window().maximize();
	
	//to open the web application
	driver.get("https://www.instagram.com/");
	
	//to stop the window 2sec
	Thread.sleep(2000);
	
	//to close the browser
	driver.close();
	}

}
