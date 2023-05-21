package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlFrame {

	public static void main(String[] args) throws InterruptedException {

		// Launch the ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Open the WebPage
		driver.get("file:///C:/Users/ADMIN/Desktop/WCSM8/username.html");

		// find the username webelement
		Thread.sleep(2000);
		WebElement UTB = driver.findElement(By.id("i2"));
		UTB.sendKeys("Sarika");

		// switch the control to frame

		 driver.switchTo().frame(0); //using index

//		WebElement ele = driver.findElement(By.id("frid"));  //using webelement as a frame
//		driver.switchTo().frame(ele);

		 

		// find the password webelement
		WebElement PTB = driver.findElement(By.id("i1"));
		Thread.sleep(2000);
		PTB.sendKeys("Bhakti");

		// clear the password element
		Thread.sleep(2000);
		PTB.clear();

		// switch to the defalt frame
		driver.switchTo().defaultContent();

		// clear the username element
		Thread.sleep(2000);
		UTB.clear();
		
		//close the browser
		driver.quit();
	}

}
