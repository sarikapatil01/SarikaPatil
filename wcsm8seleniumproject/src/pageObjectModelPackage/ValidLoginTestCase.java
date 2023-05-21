package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Open Browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//get the valid input in property file
		Flib flib = new Flib();
		
		//handle login page
		LoginPage lp = new LoginPage(driver);
		
		lp.validLoginPage(flib.readPropertyData(PROPERTY_PATH, "username"), flib.readPropertyData(PROPERTY_PATH,"password"));
		
		//handle homepage
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.logOut();
		Thread.sleep(2000);
		
		bt.tearDown();
		
		
		
		
	}

}
