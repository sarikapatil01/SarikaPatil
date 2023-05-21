package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindow {
	
	//How to close Child window only

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Open the web application
		driver.get("http://omayo.blogspot.com/");
				
		//find out the web Elementon webpage
		WebElement link = driver.findElement(By.xpath("//a[.='Open a popup window']"));
				
		//find the position of webElement
		Point loc = link.getLocation();
		int xasix = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+ xasix  +" , "+(yaxis -300)+")");
		
		//To handle or get Address of Parent window
		String wh = driver.getWindowHandle();
		System.out.println("Parent Window Adress : "+ wh);
		
		link.click();
		
		//to handle or get the address of parent as well as child page or all windows
		Set<String> handleAllWindows = driver.getWindowHandles();
		for(String whs:handleAllWindows)
		{
			System.out.println("Address of All the Windows : "+ whs);
		}
		
		//close child window only
		for(String whs:handleAllWindows)
		{
			if(!wh.equals(handleAllWindows))
			{
				driver.switchTo().window(wh).close();
			}
		}
	}

}
