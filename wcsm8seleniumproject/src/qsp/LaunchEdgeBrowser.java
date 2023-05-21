package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To handle IllegalStatExcepion
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		//to launch edge browser
		WebDriver	driver=new EdgeDriver();

		//to maximize the screen
		driver.manage().window().maximize();
		
		//to stop the screen for 2sec
		Thread.sleep(2000);
		
		//to close the edge browser
		driver.close();
	}

}
