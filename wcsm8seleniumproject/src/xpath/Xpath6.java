package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath6 {

	public static void main(String[] args) throws InterruptedException {
		
		//xpath by using dependent and Indenpendent

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver	driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
	//driver.findElement(By.name("//input[@name='q']")).sendKeys("hp laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	//Thread.sleep(4000);
	waitMethod(driver,30,"//div[@class='_3879cV' and (text()='Core i7')]").click();
	//driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	//waitMethod(driver, 30,"//div[text()='Windows 11' and (@class='_3879cV')]" ).click();
	driver.findElement(By.xpath("//div[text()='Windows 11' and (@class='_3879cV')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above' and (@class='_3879cV')]")).click();
	Thread.sleep(2000);
	String priceOf1stSeggetion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println(priceOf1stSeggetion);
	driver.quit();

	}
	
	public static WebElement waitMethod(WebDriver driver,int sec,String value)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
		return ele;
		
		
	}

}
