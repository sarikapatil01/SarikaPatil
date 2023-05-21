package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSourceMethodEdge {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver	driver=new EdgeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
