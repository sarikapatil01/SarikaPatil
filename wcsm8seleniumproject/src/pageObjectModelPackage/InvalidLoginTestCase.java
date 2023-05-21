package pageObjectModelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		//open the Browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//Open Login page
		LoginPage lp = new LoginPage(driver);
		
		//get Invalid Inputs in excel sheet
		Flib flib = new Flib();
		
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreads");
		
		for(int i=0; i<rc; i++)
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 0), flib.readExcelData(EXCEL_PATH, "Invalidcreads", i, 1));
		}
		
		bt.tearDown();
		
	}

}
