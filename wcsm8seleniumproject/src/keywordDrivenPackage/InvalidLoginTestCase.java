package keywordDrivenPackage;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{
	

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		//launch the browser using generic reusable method
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//read the multiple data using generic reusable method
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreads");
		
		for(int i=1; i<rc; i++) 
		{
			//read the execel data in DataDriven Framwork using generic reusable method
			String InvalidUsername = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 0);
			String InvalidPassword = flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 1);
		
			driver.findElement(By.name("username")).sendKeys(InvalidUsername);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(InvalidPassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
	}

}
