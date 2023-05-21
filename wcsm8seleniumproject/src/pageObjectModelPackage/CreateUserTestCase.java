package pageObjectModelPackage;

import java.io.IOException;


public class CreateUserTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();
		
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginPage(flib.readPropertyData(PROPERTY_PATH, "username"), flib.readPropertyData(PROPERTY_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.usersModuleMethod();
		
		UserListPage ulp = new UserListPage(driver);
		String un = flib.readExcelData(EXCEL_PATH, "CreateUsers", 1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "CreateUsers", 1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "CreateUsers", 1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "CreateUsers", 1, 3);
		
		ulp.createUserMethod(un, pass, fn, ln);
		
		Thread.sleep(2000);
		ulp.deletUserMethod();
	}

}
