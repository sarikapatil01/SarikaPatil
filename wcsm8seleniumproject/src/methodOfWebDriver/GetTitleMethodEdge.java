package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleMethodEdge {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver	driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		Thread.sleep(2000);
		
	
	
	}

}
