package assingment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAssingment {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the WebApplication
		driver.get("https://www.flipkart.com/");
		
		//handle hidden division popup
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		//search the samsung s23
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//handle of parent window
		String parent1 = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		
		//handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			if(!parent1.equals(allHandles))
			{
				driver.switchTo().window(wh);
			}
			else {
				
			}
		}
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
		{
			System.out.println("Its Child window");
		}
		else {
			System.out.println("Window is not handle");
		}		
		
		
		//find the color of mobile
		WebElement ele = driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-2-color']"));
		
		Point lo = ele.getLocation();
		int xaxi1s = lo.getX();
		int yaxis = lo.getY();
		
		//Scrolling the element
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxi1s+","+(yaxis-200)+")");
		
		//click color element
		ele.click();
		
		//select the storege
		WebElement sto = driver.findElement(By.xpath("//a[@class='_1fGeJ5']"));
		
		Point lo2 = sto.getLocation();
		int xaxis2 = lo2.getX();
		int yaxis2 = lo2.getY();
		
		//scrolling to the element
		jse.executeScript("window.scrollBy("+xaxis2+","+(yaxis2-200)+")");
		Thread.sleep(2000);
		sto.click();
		
		//identify check element
		WebElement dil = driver.findElement(By.id("pincodeInputId"));
		Point lo3 = dil.getLocation();
		int xaxis3 = lo3.getX();
		int yaxis3 = lo3.getY();
		
		jse.executeScript("window.scrollBy("+xaxis3+","+(yaxis3-200)+")");
		
		dil.click();
		dil.sendKeys("411033");
		
		//click on check element
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		//findout AddToCart button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		//click on remove
		WebElement rem = driver.findElement(By.xpath("//div[.='Remove']"));
		Point lo4 = rem.getLocation();
		int xaxis4 = lo4.getX();
		int yaxis4 = lo4.getY();
		
		jse.executeScript("window.scrollBy("+xaxis4+","+yaxis4+")");
		rem.click();
		
		//click remove
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		
		
		
	}

}
