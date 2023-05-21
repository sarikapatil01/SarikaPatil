package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//open bluestone apllication
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	
	//move to done
	WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	//click on 1gm for 22
	driver.findElement(By.xpath("//span[.='1 gram' and (contains(@data-p,'gold-coins-22-weight-1gms,m'))]")).click();
	
	//verify the 1mg 22k coin is displayed or not
	
	WebElement coin = driver.findElement(By.xpath("//img[@class='img-responsive' and @alt='1 gram 22 KT Gold Coin']"));
	
	//WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
	if(coin.isDisplayed())
	{
		System.out.println("coin is displayed");
	}
	else {
		System.out.println("coin is not displayed we will get exception");
	}
	
	}

}
