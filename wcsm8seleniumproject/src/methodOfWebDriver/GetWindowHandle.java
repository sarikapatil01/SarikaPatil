package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(" + xasix +" ,"+ (yaxis -300) +")");
		
		link.click();
		
		//to Handle or get the Address of parent webpage
		String wh = driver.getWindowHandle();
		
		System.out.println(wh);
		
		


	}

}
