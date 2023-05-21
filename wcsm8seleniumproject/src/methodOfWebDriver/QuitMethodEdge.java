package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethodEdge {

	public static void main(String[] args) throws InterruptedException {
	
		//To handle IllegaleStatException
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		//To launch Edge browser
		WebDriver	driver=new EdgeDriver();
	
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//To launch web page
		driver.get("http://omayo.blogspot.com/");
		
		//To launch popup inside the webpage
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		//To stop the screen 2sec
		Thread.sleep(2000);
		
		//To close the browser as well as all sides
		driver.quit();
	}

}
