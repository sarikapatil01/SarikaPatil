package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	WebElement value = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	boolean dis = value.isEnabled();
	System.out.println(dis);
	driver.findElement(By.name("username")).sendKeys("Sarika");
	driver.findElement(By.name("password")).sendKeys("Sari@13");
	boolean dis2 = value.isEnabled();
	System.out.println(dis2);
		
	}

}
