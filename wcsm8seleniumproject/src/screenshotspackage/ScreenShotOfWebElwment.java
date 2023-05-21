package screenshotspackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElwment {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch webpage of Instagram
		driver.get("https://www.instagram.com/");
		
		//find the webElement of Button on Instagram WebPage
		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		if(button.isEnabled())
		{
			System.out.println("we can do the login");
		
		}
		else {
			System.out.println("we can not do login button !! SS is taken");
			
			File scr = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/webelementss1.jpg");
			Files.copy(scr, dest);
		}
	}

}
