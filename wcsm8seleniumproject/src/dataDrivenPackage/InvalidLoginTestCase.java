package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flip{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
		WebDriver 	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open webApplication
		driver.get("http://desktop-3darda3/login.do");
		
		//To read the data for External file create object for Flip class
		Flip flip = new Flip();
		
		int rc = flip.rowCount("./data/ActiTimeTestData.xlsx", "Invalidcreads");
		
		for(int i=1; i<=rc; i++)
		{
			String invalidusername = flip.readExcelDada("./data/ActiTimeTestData.xlsx", "Invalidcreads", i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			Thread.sleep(2000);
			String invalidpassword = flip.readExcelDada("./data/ActiTimeTestData.xlsx", "Invalidcreads", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
			
			
		}
		
	}

}
