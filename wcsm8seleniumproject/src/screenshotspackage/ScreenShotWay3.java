package screenshotspackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chromedriver.exe", "./drivers/chromedriver.exe");
		//WebDriver	driver=new ChromeDriver();
		RemoteWebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		//using upcast to RemoteWebDriver class
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/ss3.png");
	Files.copy(src, dest);
	
	}

}
