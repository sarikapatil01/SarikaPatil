package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

//Multilevel Inheritance achive
//ValidLoginTestCase extends BaseTest extends Flib

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws java.io.FileNotFoundException, IOException {

		//to open the browser Create the object of BestTest
		BaseTest bt = new BaseTest();
		
		//to launch the browser call the method
		bt.openBrowser();
		
		//to read the data in property file create Object Flib class
		Flib flib = new Flib();
		
		//To call the Method 
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROPERTY_PATH, "username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROPERTY_PATH, "password"));
		
		driver.findElement(By.id("loginButton")).click();
		
		//to call the method form close the browser
		bt.closeBrowser();
	}

}
