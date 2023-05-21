package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttributeMethod3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.com/");
	WebElement searchB = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
	String value = searchB.getAttribute("name");
	System.out.println(value);
	}

}
