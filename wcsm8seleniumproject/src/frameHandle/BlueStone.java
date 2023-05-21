package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		
		//switch the control to frame for click on chat box by using name or id
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		
		//by using web element as a frame
		//driver.switchTo().frame(frameElement);
		
		 WebElement chatkbox = driver.findElement(By.id("chat-icon"));
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(chatkbox)).click();
		
		//switch the control to default webpage
		driver.switchTo().defaultContent();
		
		//insert the inputs for text box
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("sarika");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("sari@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("235688992851");
		
		
	}

}