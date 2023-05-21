package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends Flip{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the web Application
		driver.get("http://desktop-3darda3/login.do");
		
		//To read the data form external files create object of Flip
		Flip flip = new Flip();
//		String validUsername = flip.readExcelDada("./data/ActiTimeTestData.xlsx","validcreds", 1, 0);
//		
//		String validPassword = flip.readExcelDada("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
//		
//		driver.findElement(By.name("username")).sendKeys(validUsername);
//		Thread.sleep(2000);
//		driver.findElement(By.name("pwd")).sendKeys(validPassword);
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(4000);
//		driver.quit();
		
	
		//Using another Way
		
		driver.findElement(By.name("username")).sendKeys(flip.readExcelDada("./data/ActiTimeTestData.xlsx","validcreds", 1, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flip.readExcelDada("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
