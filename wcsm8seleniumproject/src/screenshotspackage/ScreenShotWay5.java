package screenshotspackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//consider we are taking ss of Selenium.dev webpage
	driver.get("https://www.selenium.dev");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	//Implementation of Method
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/ss5.png");
	
	Files.copy(src, dest);
	
	}

}
